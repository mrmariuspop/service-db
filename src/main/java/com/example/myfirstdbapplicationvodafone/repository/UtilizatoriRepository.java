package com.example.myfirstdbapplicationvodafone.repository;

import com.example.myfirstdbapplicationvodafone.entity.Utilizator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilizatoriRepository extends JpaRepository<Utilizator, Integer> {

    public List<Utilizator> findAllByNume(String nume);

}
