package com.esprit.microservereurekaclient;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Reservation implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private int cinEtudiant;
    private String anneeReservation,typeChambre;

    public Reservation() {
    }

    public Reservation(int cinEtudiant, String anneeReservation, String typeChambre) {

        this.cinEtudiant = cinEtudiant;
        this.anneeReservation = anneeReservation;
        this.typeChambre = typeChambre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCinEtudiant() {
        return cinEtudiant;
    }

    public void setCinEtudiant(int cinEtudiant) {
        this.cinEtudiant = cinEtudiant;
    }

    public String getAnneeReservation() {
        return anneeReservation;
    }

    public void setAnneeReservation(String anneeReservation) {
        this.anneeReservation = anneeReservation;
    }

    public String getTypeChambre() {
        return typeChambre;
    }

    public void setTypeChambre(String typeChambre) {
        this.typeChambre = typeChambre;
    }
}
