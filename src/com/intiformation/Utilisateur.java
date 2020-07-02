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
	
	
	
}//end class
