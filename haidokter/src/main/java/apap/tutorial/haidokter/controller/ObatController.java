package apap.tutorial.haidokter.controller;

import apap.tutorial.haidokter.model.ObatModel;
import apap.tutorial.haidokter.model.ResepModel;
import apap.tutorial.haidokter.service.ObatService;
import apap.tutorial.haidokter.service.ResepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model ;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ObatController {
    @Qualifier("resepServiceImpl")
    @Autowired
    ResepService resepService;

    @Autowired
    ObatService obatService;

    @GetMapping("/obat/add/{noResep}")
    private String addResepFormPage(
            @PathVariable Long noResep,
            Model model
    ){
        ObatModel obat = new ObatModel();
        ResepModel resep = resepService.getResepByNomorResep(noResep);
        obat.setResepModel(resep);
        model.addAttribute("obat", obat);

        return "form-add-obat";
    }

    @PostMapping("/obat/add")
    private String addObatSubmit(
            @ModelAttribute ObatModel obat,
            Model model
    ){
        obatService.addObat(obat);
        model.addAttribute("nama", obat.getNama());

        return "add-obat";
    }

    /*
    @GetMapping("/obat/delete/{id}")
    public String deleteResep(
            @PathVariable Long id,
            Model model) {

        ObatModel obat = obatService.getObatById(id);
        obatService.deleteObat(obat);
        model.addAttribute("nama", obat.getNama());

        // Return view template yang ingin digunakan
        return "delete-obat";
    }
     */

    @PostMapping("/obat/delete")
    public String deleteMenuFormSubmit(
            @ModelAttribute ResepModel resep,
            Model model) {
        model.addAttribute("obatCount", resep.getListObat().size());
        for(ObatModel obat: resep.getListObat()){
            obatService.deleteObatById(obat.getId());
        }

        // Return view template yang ingin digunakan
        return "delete-obat";
    }

    @GetMapping("/obat/change/{id}")
    private String changeObatFormPage(
            @PathVariable Long id,
            Model model
    ){
        ObatModel obat = obatService.getObatById(id);
        model.addAttribute("obat", obat);

        return "form-update-obat";
    }

    @PostMapping("/obat/change")
    private String changeObatFormSubmit(
            @ModelAttribute ObatModel obat,
            Model model
    ) {
        ObatModel updatedObat = obatService.updateObat(obat);
        model.addAttribute("updatedObat", updatedObat.getId());

        return "update-obat";
    }
}