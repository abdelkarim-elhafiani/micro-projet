package models;

public class LignesCommande {
	private String numCommande;
	private String codeArticle;
	private int qteCde;
	
	public LignesCommande(String numCommande, String codeArticle, int qteCde) {
		super();
		this.numCommande = numCommande;
		this.codeArticle = codeArticle;
		this.qteCde = qteCde;
	}

	public String getNumCommande() {
		return numCommande;
	}

	public void setNumCommande(String numCommande) {
		this.numCommande = numCommande;
	}

	public String getCodeArticle() {
		return codeArticle;
	}

	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}

	public int getQteCde() {
		return qteCde;
	}

	public void setQteCde(int qteCde) {
		this.qteCde = qteCde;
	}

	public LignesCommande() {
		// TODO Auto-generated constructor stub
	}

}
