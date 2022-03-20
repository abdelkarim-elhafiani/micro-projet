package models;

public class Article {
	private int codeArticle;
	private String designation;
	private float prix;
	private int stock;
	private Categorie categorie=new Categorie();
	private String photo;
	
	
	
	
	
	
	public Article(int codeArticle, String designation, float prix, int stock, Categorie categorie, String photo) {
		super();
		this.codeArticle = codeArticle;
		this.designation = designation;
		this.prix = prix;
		this.stock = stock;
		this.categorie = categorie;
		this.photo = photo;
	}
	public int getCodeArticle() {
		return codeArticle;
	}
	public void setCodeArticle(int codeArticle) {
		this.codeArticle = codeArticle;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Article() {
		// TODO Auto-generated constructor stub
	}

}
