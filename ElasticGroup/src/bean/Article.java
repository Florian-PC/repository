package bean;

/**
 * @author florianpuzenat
 *
 */
public class Article extends Produit {

	private Couleur couleur;
	private float prixVente;
	private int stockArticle;
	private int quantity;

	/**
	 * 
	 */
	public Article() {
		super();
	}

	/**
	 * @param couleur
	 * @param prixVente
	 */
	public Article(Couleur couleur, float prixVente) {
		super();
		this.couleur = couleur;
		this.prixVente = prixVente;
		this.quantity = 1;
	}

	/**
	 * @return couleur
	 */
	public Couleur getCouleur() {
		return couleur;
	}

	/**
	 * @return prixVente
	 */
	public float getPrixVente() {
		return prixVente;
	}

	/**
	 * @return stockArticle
	 */
	public int getStockArticle() {
		return stockArticle;
	}

	/**
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param couleur
	 */
	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	/**
	 * @param prixVente
	 */
	public void setPrixVente(float prixVente) {
		this.prixVente = prixVente;
	}

	/**
	 * @param stockArticle
	 */
	public void setStockArticle(int stockArticle) {
		this.stockArticle = stockArticle;
	}

	/**
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
