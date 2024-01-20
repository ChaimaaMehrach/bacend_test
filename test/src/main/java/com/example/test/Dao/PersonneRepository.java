package com.example.test.Dao;



import com.example.test.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository  extends JpaRepository<Personne, Integer> {
    Personne findByEmailAndPassword(String email, String password);

	Personne findByEmail(String email);
}
