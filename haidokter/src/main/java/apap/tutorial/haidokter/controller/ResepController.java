package apap.tutorial.haidokter.controller;

import apap.tutorial.haidokter.model.ResepModel;
import apap.tutorial.haidokter.service.ResepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model ;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ResepController{
    @Autowired
    private ResepService resepService;

    // Routing URL yang diinginkan
    @RequestMapping("/resep/add")
    public String addResep(
            // Request Parameter yang ingin dibawa
            @RequestParam(value = "noResep", required = true) String noResep,
            @RequestParam(value = "namaDokter", required = true) String namaDokter,
            @RequestParam(value = "namaPasien", required = true) String namaPasien,
            @RequestParam(value = "catatan", required = true) String catatan,
            Model model
            ){
        // Membuat objek ResepModel
        ResepModel resep = new ResepModel(noResep, namaDokter, namaPasien, catatan);

        // Memanggil service addResep
        resepService.addResep(resep);

        // Add variabel nomor resep ke 'nomorResep' untuk dirender pada thymeleaf
        model.addAttribute("nomorResep", noResep);

        // Return view template yang ingin digunakan
        return "add-resep";
    }

    @RequestMapping("/resep/viewall")
    public String listResep(Model model){
        // Mendapatkan semuaResepModel
        List<ResepModel> listResep= resepService.getResepList();

        // Add variabel semua ResepModel ke 'listResep' untuk dirender pada thymeleaf
        model.addAttribute("listResep", listResep);

        // Return view template yang ingin digunakan
        return "viewall-resep";
    }

    // Routing URL untuk melihat detail resep
    @RequestMapping("/resep/view")
    public String detailResep(
            @RequestParam(value = "noResep") String noResep,
            Model model){

        // Mendapatkan ResepModel sesuai nomor resep
        ResepModel resep= resepService.getResepByNomorResep(noResep);

        // Jika nomor resep tak valid
        if(resep.equals(null)){
            return "error";
        }

        // Add variabel ResepModel ke 'resep' untuk dirender pada thymeleaf
        model.addAttribute("resep", resep);

        // Return view template yang ingin digunakan
        return "view-resep";

    }

    // Routing untuk melihat resep dari nomornya
    @RequestMapping(path="/resep/view/no-resep/{noResep}")
    public String viewResep(
            @PathVariable("noResep") String noResep, Model model){
        ResepModel resepDipilih= resepService.getResepByNomorResep(noResep);

        // Jika nomor resep tak valid
        if(resepDipilih.equals(null)){
            return "error";
        }

        model.addAttribute("resep", resepDipilih);

        // Return view template yang ingin digunakan
        return "view-resep";
    }

    // Update resep
    @RequestMapping(path="/resep/update/no-resep/{noResep}/{attribut}/{changeWord}")
    public String updateResep(
            @PathVariable("noResep") String noResep,
            @PathVariable("attribut") String attribut,
            @PathVariable("changeWord") String changeWord,
            Model model){
        ResepModel resepUpdate= resepService.getResepByNomorResep(noResep);

        // Jika nomor resep tak valid
        if(resepUpdate.equals(null)){
            return "error";
        }

        String old;
        if(attribut.equals("noResep")){
            old = resepUpdate.getNoResep();
            resepUpdate.setNoResep(changeWord);
        } else if (attribut.equals("namaDokter")){
            old = resepUpdate.getNamaDokter();
            resepUpdate.setNamaDokter(changeWord);
        } else if (attribut.equals("namaPasien")){
            old = resepUpdate.getNamaPasien();
            resepUpdate.setNamaPasien(changeWord);
        } else if (attribut.equals("catatan")){
            old = resepUpdate.getCatatan();
            resepUpdate.setCatatan(changeWord);
        }else{
            old = "";
        }

        model.addAttribute("old", old);
        model.addAttribute("attribut", attribut);
        model.addAttribute("changeWord", changeWord);
        model.addAttribute("resep", resepUpdate);

        // Return view template yang ingin digunakan
        return "change-resep";
    }

    @RequestMapping(path="/resep/delete/no-resep/{noResep}")
    public String deleteResep(
            @PathVariable("noResep") String noResep, Model model){

        List<ResepModel> resepDelete= resepService.deleteResepByNomorResep(noResep);

        // Jika nomor resep tak valid
        if(resepDelete.equals(null)){
            return "error";
        }

        model.addAttribute("nomorResep", noResep);

        // Return view template yang ingin digunakan
        return "delete-resep";
    }

}