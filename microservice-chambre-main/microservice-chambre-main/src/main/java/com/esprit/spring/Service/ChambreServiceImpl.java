package com.esprit.spring.Service;

import com.esprit.spring.entity.Chambre;

import java.util.List;

public interface ChambreServiceImpl {
    Chambre addChambre(Chambre chambre);

    List<Chambre> getAllChambres();
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(Long id);

    Chambre findById(long id);
}
