package bean;

/**
 * @author florianpuzenat 
 * bean Sous Famille
 */
public class SSFamille implements IFiltrable {

	private int idSSFamille;
	private String libelleSSFamille;

	/**
	 * Constructeur
	 */
	public SSFamille() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param idSSFamille
	 * @param libelleSSFamille
	 */
	public SSFamille(int idSSFamille, String libelleSSFamille) {
		super();
		this.idSSFamille = idSSFamille;
		this.libelleSSFamille = libelleSSFamille;
	}

	/**
	 * @return idSSFamille
	 */
	public int getIdSSFamille() {
		return idSSFamille;
	}

	/**
	 * @return libelleSSFamille
	 */
	public String getLibelleSSFamille() {
		return libelleSSFamille;
	}

	/**
	 * @param idSSFamille
	 */
	public void setIdSSFamille(int idSSFamille) {
		this.idSSFamille = idSSFamille;
	}

	/**
	 * @param libelleSSFamille
	 */
	public void setLibelleSSFamille(String libelleSSFamille) {
		this.libelleSSFamille = libelleSSFamille;
	}

	/**
	 * @see bean.IFiltrable#getId()
	 */
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return idSSFamille;
	}

	/**
	 * @see bean.IFiltrable#getLibelle()
	 */
	@Override
	public String getLibelle() {
		// TODO Auto-generated method stub
		return libelleSSFamille;
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
