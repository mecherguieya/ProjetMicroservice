package com.esprit.spring.repository;

import com.esprit.spring.entity.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface ChambreRepository extends JpaRepository<Chambre,Long> {



        }

