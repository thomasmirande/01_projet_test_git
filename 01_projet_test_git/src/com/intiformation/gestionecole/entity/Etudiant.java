package com.intiformation.gestionecole.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Etudiant implements Serializable{
	/*-------------------Props en private-----------------------------------*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int identifiant;
	private String motDePasse;
	private String nom;
	private String prenom;
	private String email;
	private boolean photo;
	private String dateDeNaissance;
	
	
	/*-------------------Ctors au mini un vide------------------------------*/
	public Etudiant(int identifiant, String motDePasse, String nom, String prenom, String email, boolean photo,
			String dateDeNaissance) {
		super();
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.photo = photo;
		this.dateDeNaissance = dateDeNaissance;
	}//Ctor Full


	public Etudiant(String motDePasse, String nom, String prenom, String email, boolean photo, String dateDeNaissance) {
		super();
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.photo = photo;
		this.dateDeNaissance = dateDeNaissance;
	}//Ctor Full Without


	public Etudiant() {
		super();
	}//Ctor Vide



	/*-------------------Getters & Setter-----------------------------------*/
	

	public int getIdentifiant() {
		return identifiant;
	}


	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}


	public String getMotDePasse() {
		return motDePasse;
	}


	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isPhoto() {
		return photo;
	}


	public void setPhoto(boolean photo) {
		this.photo = photo;
	}


	public String getDateDeNaissance() {
		return dateDeNaissance;
	}


	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}


	@Override
	public String toString() {
		return "Etudiant [identifiant=" + identifiant + ", motDePasse=" + motDePasse + ", nom=" + nom + ", prenom="
				+ prenom + ", email=" + email + ", photo=" + photo + ", dateDeNaissance=" + dateDeNaissance + "]";
	}//end TooString

	
	
}
