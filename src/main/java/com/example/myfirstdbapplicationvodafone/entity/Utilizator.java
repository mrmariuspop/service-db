package com.example.myfirstdbapplicationvodafone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "utilizatori")
@Data
public class Utilizator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(name = "nume")
    String nume;

    @Column(name = "prenume")
    String prenume;

    @Column(name = "varsta")
    Integer varsta;
}
