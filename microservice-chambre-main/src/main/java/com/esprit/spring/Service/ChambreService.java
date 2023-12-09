package com.esprit.spring.Service;

import com.esprit.spring.entity.Chambre;
import com.esprit.spring.repository.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ChambreService implements ChambreServiceImpl {
    @Autowired
     ChambreRepository chambreRepository;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }
    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }



    @Override
    public Chambre updateChambre(Chambre chambre) {
        if (chambreRepository.existsById(chambre.getIdChambre())) {
            return chambreRepository.save(chambre);
        }
        return null ;
    }
    @Override
    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public Chambre findById(long id) {
        return chambreRepository.findById(id).get();
        }
    }



