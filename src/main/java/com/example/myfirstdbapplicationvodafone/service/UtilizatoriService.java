package com.example.myfirstdbapplicationvodafone.service;

import com.example.myfirstdbapplicationvodafone.entity.Utilizator;
import com.example.myfirstdbapplicationvodafone.repository.UtilizatoriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilizatoriService {

    @Autowired
    UtilizatoriRepository utilizatoriRepository;

    public List<Utilizator> aduTotiUtilizatorii() {
        return utilizatoriRepository.findAll();
    }

    public Utilizator aduUtilizatorDupaId(Integer id) {
        return utilizatoriRepository.findById(id).get();
    }

    public void creeazaUtilizator(Utilizator utilizator) {
        utilizatoriRepository.save(utilizator);
    }

    public void actualizeazaUtilizator(Utilizator utilizator) {
        utilizatoriRepository.save(utilizator);
    }

    public void stergeUtilizatorDupaId(Integer id) {
        utilizatoriRepository.deleteById(id);
    }

    public List<Utilizator> aduUtilizatoriByNume(String nume) {
        return utilizatoriRepository.findAllByNume(nume);
    }
}
