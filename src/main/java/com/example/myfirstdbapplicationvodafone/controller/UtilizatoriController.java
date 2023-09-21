package com.example.myfirstdbapplicationvodafone.controller;

import com.example.myfirstdbapplicationvodafone.entity.Utilizator;
import com.example.myfirstdbapplicationvodafone.service.UtilizatoriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/utilizatori")
public class UtilizatoriController {

    @Autowired
    UtilizatoriService utilizatoriService;

    @GetMapping("/toti")
    public List<Utilizator> aduTotiUtilizatorii() {
        return utilizatoriService.aduTotiUtilizatorii();
    }

    @GetMapping("/{id}")
    public Utilizator aduUtilizatorDupaId(@PathVariable Integer id) {
        return utilizatoriService.aduUtilizatorDupaId(id);
    }

    @PostMapping("/nou")
    public void creeazaUtilizator(@RequestBody Utilizator utilizator) {
        utilizatoriService.creeazaUtilizator(utilizator);
    }

    @PutMapping("/modifica")
    public void actualizeazaUtilizator(@RequestBody Utilizator utilizator) {
        utilizatoriService.actualizeazaUtilizator(utilizator);
    }

    @DeleteMapping("/{id}")
    public void stergeUtilizatorDupaId(@PathVariable Integer id) {
        utilizatoriService.stergeUtilizatorDupaId(id);
    }

    @GetMapping("/filtrare/{nume}")
    public List<Utilizator> aduUtilizatoriByNume(@PathVariable String nume){
        return utilizatoriService.aduUtilizatoriByNume(nume);
    }
}
