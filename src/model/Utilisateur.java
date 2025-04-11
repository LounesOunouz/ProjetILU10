package model;

public class Utilisateur {
	protected String nom;
	protected String role;

	public Utilisateur(String nom, String role) {
		this.nom = nom;
		this.role = role;
	}

	public String getNom() {
		return nom;
	}

	public String getRole() {
		return role;
	}

	public void afficherInfos() {
		System.out.println("Utilisateur : " + nom + " | Rôle : " + role);
	}
}
