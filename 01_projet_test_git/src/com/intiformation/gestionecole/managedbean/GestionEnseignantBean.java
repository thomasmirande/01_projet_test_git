package com.intiformation.gestionecole.managedbean;

import java.io.Serializable;

public class GestionEnseignantBean implements Serializable {
	/*-------------------Props en private-----------------------------------*/
	private int identifiant;
	private String motDePasse;
	private String nom;
	private String prenom;
	private String email;
	/*-------------------Ctors au mini un vide------------------------------*/
	public GestionEnseignantBean(int identifiant, String motDePasse, String nom, String prenom, String email) {
		super();
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}//end ctot full
	
	
}
