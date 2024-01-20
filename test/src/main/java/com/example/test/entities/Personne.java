package com.example.test.entities;


import jakarta.persistence.*;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne     {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

	public  String email;
	public String nom;
	public String prenom;
	public String password;
	public String Role;

	public String cin;
	
	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Personne(int id, String email, String nom, String prenom, String password ,String role,String cin) {
		super();
		this.id = id;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.Role = role;
		this.cin = cin;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return Role;
	}


	public void setRole(String role) {
		Role = role;
	}


	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
}