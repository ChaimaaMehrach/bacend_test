package com.example.test.Controller;

import com.example.test.Dao.PersonneRepository;
import com.example.test.Service.EmailService;
import com.example.test.entities.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/Personnes")
@CrossOrigin("http://localhost:4200")
public class PersonneController {
	
	
	@Autowired
	    private PersonneRepository personneRepository;
	@Autowired
	private EmailService emailServes;

	    @GetMapping("/connect/{email}/{password}")
	    public String verifyEmailAndPassword(@PathVariable String email, @PathVariable String password) {
	        // Retrieve the user by email
	        Personne personne = personneRepository.findByEmail(email);

	        // Check if the user exists and the provided password matches the stored hashed password
	        if (personne != null && isPasswordMatches(password, personne.getPassword())) {
	            return personne.getRole();
	        }
	        return null;
	    }

	    private boolean isPasswordMatches(String plainPassword, String hashedPassword) {
	        // Use BCrypt to verify if the plain text password matches the hashed password
	        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	        return passwordEncoder.matches(plainPassword, hashedPassword);
	    }
	 
	 // New API endpoint to get all persons
	    @GetMapping("/all")
	    public List<Personne> getAllPersonnes() {
	        // Retrieve all persons from the repository
	        List<Personne> personnes = personneRepository.findAll();
	        return personnes;
	    }
	    

	    
	    
	 
}
