package com.esprit.spring.ChambreController;

import com.esprit.spring.Service.ChambreService;
import com.esprit.spring.entity.Chambre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/chambre")
@RestController

public class ChambreRestAPI {
    @Autowired
    ChambreService chambreService;
    @PostMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    @PutMapping("/updateChambre")
    Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }

    @GetMapping("/getAllChambres")
    List<Chambre> getAllChambres() {
        return chambreService.getAllChambres();
    }

    @DeleteMapping("/deleteChambre/{id}")
    void deleteChambre(@PathVariable Long id) {
        chambreService.deleteChambre(id);
    }


    @GetMapping("/{id}")
    Chambre findById(@PathVariable("id") Long id){
        return chambreService.findById(id);
    }

}
