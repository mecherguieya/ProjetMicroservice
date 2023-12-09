package com.esprit.spring.entity;



import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;


import javax.persistence.*;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "Chambre")
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
    private Long idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre TypeChambre ;

    public Chambre() {
        super();
    }

    public Long getIdChambre() {
        return idChambre;
    }

    public Long getNumeroChambre() {
        return numeroChambre;
    }

    public com.esprit.spring.entity.TypeChambre getTypeChambre() {
        return TypeChambre;
    }

    public void setNumeroChambre(Long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public void setTypeChambre(com.esprit.spring.entity.TypeChambre typeChambre) {
        TypeChambre = typeChambre;
    }

    public Chambre(Long numeroChambre, com.esprit.spring.entity.TypeChambre typeChambre) {
        this.numeroChambre = numeroChambre;
        TypeChambre = typeChambre;
    }
}

