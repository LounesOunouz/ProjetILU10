package model;

public class Employe {
	private String nom;
	private String adresse;
	private String telephone;
	private String qualification;

	public Employe(String nom, String adresse, String telephone, String qualification) {
		this.nom = nom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.qualification = qualification;
	}

	public String getNom() {
		return nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getQualification() {
		return qualification;
	}

	// ✅ Méthode principale
	public void afficherProfil() {
		System.out.println("Nom : " + nom);
		System.out.println("Adresse : " + adresse);
		System.out.println("Téléphone : " + telephone);
		System.out.println("Qualification : " + qualification);
	}

	// ✅ Petite surcharge : version résumée
	public void afficherProfil(boolean resume) {
		if (resume) {
			System.out.println("Employé : " + nom + " (" + qualification + ")");
		} else {
			afficherProfil();
		}
	}
}
