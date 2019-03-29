package bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author florianpuzenat 
 * TODO will be used as a bean for listing shopping cart
 * not in use as of now
 */
public class Panier {

	private User client;
	private List<Article> listArticle = new ArrayList<Article>();
	private String etatCommande;

	public Panier() {
		super();
	}

	public Panier(User client) {
		super();
		this.client = client;
	}

	public User getClient() {
		return client;
	}

	public List<Article> getListArticle() {
		return listArticle;
	}

	public String getEtatCommande() {
		return etatCommande;
	}

	public void setClient(User client) {
		this.client = client;
	}

	public void setEtatCommande(String etatCommande) {
		this.etatCommande = etatCommande;
	}

	public void addArticle(Article art) {
		listArticle.add(art);
	}

}
