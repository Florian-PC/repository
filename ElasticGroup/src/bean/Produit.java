package bean;

/**
 * bean produit
 * 
 * @author florianpuzenat
 *
 */
public class Produit {

	private int idArticle;
	private String libelleArticle;

	private Famille famille;
	private SSFamille ssFamille;
	private Marque marque;

	/**
	 * 
	 */
	public Produit() {
		super();
	}

	/**
	 * @param idArticle
	 * @param libelleArticle
	 * @param famille
	 * @param ssFamille
	 * @param marque
	 */
	public Produit(int idArticle, String libelleArticle, Famille famille, SSFamille ssFamille, Marque marque) {
		super();
		this.idArticle = idArticle;
		this.libelleArticle = libelleArticle;
		this.famille = famille;
		this.ssFamille = ssFamille;
		this.marque = marque;
	}

	/**
	 * @return idArticle
	 */
	public int getIdArticle() {
		return idArticle;
	}

	/**
	 * @return libelleArticle
	 */
	public String getLibelleArticle() {
		return libelleArticle;
	}

	/**
	 * @return famille
	 */
	public Famille getFamille() {
		return famille;
	}

	/**
	 * @return ssFamille
	 */
	public SSFamille getSsFamille() {
		return ssFamille;
	}

	/**
	 * @return marque
	 */
	public Marque getMarque() {
		return marque;
	}

	/**
	 * @param idArticle
	 */
	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	/**
	 * @param libelleArticle
	 */
	public void setLibelleArticle(String libelleArticle) {
		this.libelleArticle = libelleArticle;
	}

	/**
	 * @param famille
	 */
	public void setFamille(Famille famille) {
		this.famille = famille;
	}

	/**
	 * @param ssFamille
	 */
	public void setSsFamille(SSFamille ssFamille) {
		this.ssFamille = ssFamille;
	}

	/**
	 * @param marque
	 */
	public void setMarque(Marque marque) {
		this.marque = marque;
	}

}
