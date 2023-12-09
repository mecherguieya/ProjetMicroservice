package com.esprit.spring.entities;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Bloc implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBloc;

    private String nomBloc;
    private Long capaciteBloc;


    public Long getIdBloc() {
        return idBloc;
    }

    public String getNomBloc() {
        return nomBloc;
    }

    public void setNomBloc(String nomBloc) {
        this.nomBloc = nomBloc;
    }

    public Long getCapaciteBloc() {
        return capaciteBloc;
    }

    public void setCapaciteBloc(Long capaciteBloc) {
        this.capaciteBloc = capaciteBloc;
    }

    public Bloc() {
    }

    public Bloc(String nomBloc, Long capaciteBloc) {
        this.nomBloc = nomBloc;
        this.capaciteBloc = capaciteBloc;
    }

}
