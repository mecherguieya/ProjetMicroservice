package com.esprit.spring.UniversiteController;


import com.esprit.spring.Service.UniversiteServiceImpl;
import com.esprit.spring.entity.Universite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/universite")
@RestController
public class UniversiteRestAPI {
    @Autowired
    UniversiteServiceImpl universiteService;
    private String title = "Hello,i'm the Job Micro Service";

    @RequestMapping("/hello")
    public String sayHello() {
        System.out.println(title);
        return title;

    }
    @PostMapping("/adduniversite")
    Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    @PutMapping("/updateUniversite")
    Universite updateUniversite(@RequestBody Universite Universite)
    {
        return universiteService.updateUniversite(Universite);
    }

    @GetMapping("/afficherUniversites")
    List<Universite> getAllUniversite()
    {
        return universiteService.getAllUniversites();
    }

    @DeleteMapping("/deleteUniversite/{id}")
    void deleteUniversite(@PathVariable Long id)
    {
        universiteService.deleteUniversite(id);
    }

    @GetMapping("/{id}")
    Universite findById(@PathVariable("id") Long id){
        return universiteService.findById(id);
    }

}






