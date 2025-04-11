package controller;

import model.Administrateur;
import model.AgentRH;
import model.DossierEmploye;
import model.Employe;
import model.Utilisateur;

public class TestUtilisateur {
	public static void main(String[] args) {
		Utilisateur u1 = new Utilisateur("Lounes", "Utilisateur générique");
		Administrateur admin = new Administrateur("Sophie", "CNAS");
		AgentRH rh = new AgentRH("Karim", "Service Recrutement");
		Employe arezki = new Employe("Arezki", "Tizi-n-BOUALI", "06666666", "manager");
		DossierEmploye Dossier1 = new DossierEmploye(1, arezki, admin, "20/10/2002", "un bon homme , honnéte");
		System.out.println("--- Test Utilisateur ---");
		u1.afficherInfos();

		System.out.println("\n--- Test Administrateur ---");
		admin.afficherInfos();

		System.out.println("\n--- Test Agent RH ---");
		rh.afficherInfos();
		System.out.println("\n Test Arezkiiiii~~~~~~~");
		arezki.afficherProfil();
		System.out.println("\n Test LEdossier~~~~~~~");
		Dossier1.afficherDossier();

	}
}
