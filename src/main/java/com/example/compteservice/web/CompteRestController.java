package com.example.compteservice.web;

import com.example.compteservice.entities.Compte;
import com.example.compteservice.repositories.CompteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 @RestController
 */

public class CompteRestController {
    private CompteRepository compteRepository;
    //Injection de dépendance :
    public CompteRestController(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }
    //pour acceder à cette méthode j'utilise une requette http avec get
    @GetMapping(path = "/comptes")
    public List<Compte> listComptes(){
        return compteRepository.findAll();
    }
    @GetMapping(path = "/comptes/{id}")
    public Compte getCompte(@PathVariable(name = "id") Long code){
        return compteRepository.findById(code).get();
    }
    @PostMapping(path = "/comptes")
    public Compte save(@RequestBody Compte compte){
        return compteRepository.save(compte);
    }
    @PutMapping(path = "/comptes/{id}")
    public Compte update(@PathVariable Long id, @RequestBody Compte compte){
        compte.setCode(id);
        return compteRepository.save(compte);
    }
    @DeleteMapping(path = "/comptes/{id}")
    public void delete(@PathVariable Long id){
        compteRepository.deleteById(id);
    }
}
