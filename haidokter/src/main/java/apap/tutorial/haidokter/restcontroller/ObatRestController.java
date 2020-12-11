package  apap.tutorial.haidokter.restcontroller;

import apap.tutorial.haidokter.model.ObatModel;
import apap.tutorial.haidokter.model.ResepModel;
import apap.tutorial.haidokter.rest.ObatDetail;
import apap.tutorial.haidokter.rest.ResepDetail;
import apap.tutorial.haidokter.service.ObatRestService;
import apap.tutorial.haidokter.service.ResepRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1")
public class ObatRestController{
    @Autowired
    private ObatRestService obatRestService;

    @Autowired
    private ResepRestService resepRestService;

    @PostMapping(value = "/obat/{noResep}")
    private ObatModel createObat(@PathVariable(value = "noResep") Long noResep, @Valid @RequestBody ObatModel obat, BindingResult bindingResult) {
        if(bindingResult.hasFieldErrors()){
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Request body has invalid type or missing field"
            );
        }
        else{
            ResepModel resep = resepRestService.getResepByNoResep(noResep);
            obat.setResepModel(resep);
            return obatRestService.createObat(obat);
        }
    }

    @DeleteMapping(value = "/obat/{id}")
    private ResponseEntity<String> deleteObat(@PathVariable("id") Long id){
        try{
            obatRestService.deleteObat(id);
            return  ResponseEntity.ok("Obat with Number " + String.valueOf(id) + " has been deleted!");
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Obat with Number " + String.valueOf(id) + " not found!"
            );
        }

    }

    @PutMapping(value = "/obat/{id}")
    private ObatModel updateObat(@PathVariable(value = "id") Long id, @RequestBody ObatModel obat){
        try{
            return obatRestService.changeObat(id, obat);
        } catch (NoSuchElementException e){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Obat with Number " + String.valueOf(id) + " not found!"
            );
        }
    }

    @GetMapping(value = "/obat-all")
    private List<ObatModel> retrieveListObat() { return obatRestService.retrieveListObat();}

    @GetMapping(value = "/obat/{id}")
    private ObatModel getObatById(@PathVariable(value = "id") Long id){
        try{
            return obatRestService.getObatById(id);
        } catch (NoSuchElementException e){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Obat with Number " + String.valueOf(id) + " not found!"
            );
        }
    }

    @GetMapping(value = "/hospitals/find")
    private Mono<String> hospital(@RequestParam String state){
        return obatRestService.getHositalByState(state);
    }

}
