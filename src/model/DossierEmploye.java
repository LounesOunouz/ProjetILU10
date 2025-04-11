package model;

public class DossierEmploye {
	private int numero;
	private Employe employe;
	private Administrateur expediteur;
	private String dateEnvoi;
	private String dateReception;
	private String texteProfil;
	private String texteCrypte;

	public DossierEmploye(int numero, Employe employe, Administrateur expediteur, String dateEnvoi,
			String texteProfil) {
		this.numero = numero;
		this.employe = employe;
		this.expediteur = expediteur;
		this.dateEnvoi = dateEnvoi;
		this.texteProfil = texteProfil;
		this.texteCrypte = null; // sera rempli après le cryptage
	}

	public int getNumero() {
		return numero;
	}

	public Employe getEmploye() {
		return employe;
	}

	public Administrateur getExpediteur() {
		return expediteur;
	}

	public String getDateEnvoi() {
		return dateEnvoi;
	}

	public String getDateReception() {
		return dateReception;
	}

	public String getTexteProfil() {
		return texteProfil;
	}

	public String getTexteCrypte() {
		return texteCrypte;
	}

	// ✅ Méthode pour fixer la date de réception (à une seule occasion)
	public void enregistrerReception(String dateReception) {
		this.dateReception = dateReception;
	}

	// ✅ Méthode pour enregistrer le texte crypté (une fois chiffré)
	public void enregistrerTexteCrypte(String texteCrypte) {
		this.texteCrypte = texteCrypte;
	}

	public void afficherDossier() {
		System.out.println("Dossier #" + numero);
		System.out.println("Expéditeur : " + expediteur.getNom());
		employe.afficherProfil(true);
		System.out.println("Date d'envoi : " + dateEnvoi);
		if (dateReception != null) {
			System.out.println("Date de réception : " + dateReception);
		}
		System.out.println("Texte original : " + texteProfil);
		if (texteCrypte != null) {
			System.out.println("Texte crypté : " + texteCrypte);
		}
	}
}
