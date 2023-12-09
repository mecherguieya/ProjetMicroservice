package com.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "universite")

public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;

    @Column(name = "nomUniversite")
    private String nomUniversite;

    @Column(name = "adresse")
    private String adresse;

    public Universite() {
        super();
    }

    public long getIdUniversite() {
        return idUniversite;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Universite(String nomUniversite, String adresse) {
        this.nomUniversite = nomUniversite;
        this.adresse = adresse;
    }
}
