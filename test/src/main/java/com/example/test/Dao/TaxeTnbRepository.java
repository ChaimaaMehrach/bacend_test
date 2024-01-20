package com.example.test.Dao;

import com.example.test.entities.Categorie;
import com.example.test.entities.TaxeTnb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaxeTnbRepository extends JpaRepository<TaxeTnb,Integer>{
    Optional<TaxeTnb> findByCategorie(Categorie categorieName);
}
