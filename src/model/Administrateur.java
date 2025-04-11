package model;

public class Administrateur extends Utilisateur {
	protected String administration;

	public Administrateur(String nom, String administration) {
		super(nom, "Administrateur");
		this.administration = administration;
	}

	public String getAdministration() {
		return administration;
	}

	public void afficherInfos() {
		super.afficherInfos();
		System.out.println("Administration : " + administration);
	}
}
