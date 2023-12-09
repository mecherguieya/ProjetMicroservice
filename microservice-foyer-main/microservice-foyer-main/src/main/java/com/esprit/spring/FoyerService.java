package com.esprit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class FoyerService {
    @Autowired
    FoyerRepository foyerRepository;

    public Foyer addFoyer(Foyer foyer) { return foyerRepository.save(foyer); }
    public List<Foyer> getAllFoyers() {
        return foyerRepository.findAll();
    }

    public Foyer updateFoyer(Foyer foyer) {
        if (foyerRepository.existsById(foyer.getIdFoyer())) {
            return foyerRepository.save(foyer);
        }
        return null;
    }

    public void deleteFoyer(Long id) { foyerRepository.deleteById(id); }
    public Optional<Foyer> findFoyerById(Long idFoyer) {
        return foyerRepository.findById(idFoyer);
    }


}
