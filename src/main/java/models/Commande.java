package models;

import java.util.Date;

public class Commande {
		private String numCommande;
		private String codeClient;
		private Date dateCommande=new Date();
		
	public Commande(String numCommande, String codeClient, Date dateCommande) {
			super();
			this.numCommande = numCommande;
			this.codeClient = codeClient;
			this.dateCommande = dateCommande;
		}

	public String getNumCommande() {
			return numCommande;
		}

		public void setNumCommande(String numCommande) {
			this.numCommande = numCommande;
		}

		public String getCodeClient() {
			return codeClient;
		}

		public void setCodeClient(String codeClient) {
			this.codeClient = codeClient;
		}

		public Date getDateCommande() {
			return dateCommande;
		}

		public void setDateCommande(Date dateCommande) {
			this.dateCommande = dateCommande;
		}

	public Commande() {
		// TODO Auto-generated constructor stub
	}

}
