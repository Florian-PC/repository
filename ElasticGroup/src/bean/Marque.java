package bean;

/**
 * @author florianpuzenat 
 * bean marque
 */

public class Marque implements IFiltrable {

	private int idMarque;
	private String libelleMarque;

	/**
	 * constructeur
	 */
	public Marque() {
		super();
	}

	/**
	 * constructeur
	 * 
	 * @param idMarque
	 * @param libelleMarque
	 */
	public Marque(int idMarque, String libelleMarque) {
		super();
		this.idMarque = idMarque;
		this.libelleMarque = libelleMarque;
	}

	/**
	 * @return idFamille
	 */
	public int getIdFamille() {
		return idMarque;
	}

	/**
	 * @return libelleFamille
	 */
	public String getLibelleFamille() {
		return libelleMarque;
	}

	/**
	 * @param idMarque
	 */
	public void setIdFamille(int idMarque) {
		this.idMarque = idMarque;
	}

	/**
	 * @param libelleMarque
	 */
	public void setLibelleFamille(String libelleMarque) {
		this.libelleMarque = libelleMarque;
	}

	/**
	 * @see bean.IFiltrable#getId()
	 */
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return idMarque;
	}

	/**
	 * @see bean.IFiltrable#getLibelle()
	 */
	@Override
	public String getLibelle() {
		// TODO Auto-generated method stub
		return libelleMarque;
	}

	/**
	 * @see bean.IFiltrable#getColor()
	 */
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return null;
	}

}
