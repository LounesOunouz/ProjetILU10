package model;

public class AgentRH extends Utilisateur {
	protected String service;

	public AgentRH(String nom, String service) {
		super(nom, "Agent RH");
		this.service = service;
	}

	public String getService() {
		return service;
	}

	public void afficherInfos() {
		super.afficherInfos();
		System.out.println("Service RH : " + service);
	}
}
