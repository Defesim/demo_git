package com.intiformation;

/**
 * 
 * @author Kevin
 *
 */
public class Utilisateur {

	/*__________ props __________*/
	private int id;
	private String nom;
	private String prenom;
	
	/*__________ ctors __________*/
	/**
	 * ctor vide
	 */
	public Utilisateur() {
		super();
	}
	
	/**
	 * ctor chargé
	 * @param id
	 * @param nom
	 * @param prenom
	 */
	public Utilisateur(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	/**
	 * ctor chargé sans id
	 * @param nom
	 * @param prenom
	 */
	public Utilisateur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/*__________ gt&st __________*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	
}//end class
