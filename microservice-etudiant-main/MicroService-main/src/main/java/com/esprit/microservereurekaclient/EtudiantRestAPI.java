package com.esprit.microservereurekaclient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Etudiant")
@CrossOrigin(origins = " *")
@RestController
public class EtudiantRestAPI {

    private String hello = "Hello I'm An Etudiant";

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/hello")
    public String sayHello() {
        return hello;
    }

    @Autowired
    private EtudiantService etudiantService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Etudiant> createorganisation(@RequestBody Etudiant etudiant) {
        return new ResponseEntity<>(etudiantService.AddEtudiant(etudiant), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping(value = "/{ID_ETUDIANT}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Etudiant> updateetudiant(@PathVariable(value = "ID_ETUDIANT ") int ID_ETUDIANT ,
                                                         @RequestBody Etudiant etudiant) {
        return new ResponseEntity<>(etudiantService.updateEtudiant(ID_ETUDIANT , etudiant),
                HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/Etudiant/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteetudiant(@PathVariable(value = "id") int id) {
        return new ResponseEntity<>(etudiantService.deleteEtudiant(id), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Etudiant>> getetudiant() {
        List<Etudiant> etudiant = etudiantService.getAllEtudiant();
        if (etudiant != null) {
            return new ResponseEntity<>(etudiant, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //@CrossOrigin(origins = "http://localhost:4200/etudiant/{id}")
    @GetMapping("/Etudiant/{id}")
    @ResponseStatus(HttpStatus.OK)
    private ResponseEntity<Etudiant> getEtudiant(@PathVariable("id") int id) {
        Etudiant etudiant = etudiantService.getEtudiantById(id);
        return ResponseEntity.status(HttpStatus.OK).body(etudiant);
    }


}
