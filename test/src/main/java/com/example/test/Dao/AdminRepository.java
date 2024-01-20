package com.example.test.Dao;

import com.example.test.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
public List<Admin> findByNom(String nom);
}
