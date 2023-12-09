package com.esprit.spring.repository;

import com.esprit.spring.entity.Universite;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.ws.rs.QueryParam;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {

}
