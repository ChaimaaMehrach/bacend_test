package com.example.test.Dao;


import com.example.test.entities.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProprietaireRepositori extends JpaRepository<Proprietaire, Integer> {

	public Proprietaire findById(int proprietaireId);

	public Proprietaire findByEmail(String email);
	

}
