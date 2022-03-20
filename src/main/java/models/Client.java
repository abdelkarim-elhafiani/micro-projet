package models;

public class Client {
	private String id;
	private String email;
	private String nom;
	private String prenom;
	private String adresse;
	private String motPasse;
	


	public Client(String nom, String prenom, String adresse,String email,
				  String motPasse) {
		super();
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.motPasse = motPasse;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getMotPasse() {
		return motPasse;
	}

	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}

	public Client() {
		// TODO Auto-generated constructor stub
	}

}
