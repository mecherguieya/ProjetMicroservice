package com.esprit.spring.Service;

import com.esprit.spring.entity.Universite;


import java.util.List;

public interface UniversiteServiceImpl {
    Universite addUniversite(Universite universite);

    List<Universite> getAllUniversites();
    Universite updateUniversite(Universite universite);
    void deleteUniversite(Long id);

    Universite findById(long id);
}
