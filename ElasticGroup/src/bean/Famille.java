package bean;


/**
 * @author florianpuzenat
 * bean Famille
 */
public class Famille implements IFiltrable{

	private int idFamille;
	private String libelleFamille;
	
	/**
	 * Constructeur
	 */
	public Famille() {
		super();
	}

	/**
	 * Constructeur
	 * @param idFamille
	 * @param libelleFamille
	 */
	public Famille(int idFamille, String libelleFamille) {
		super();
		this.idFamille = idFamille;
		this.libelleFamille = libelleFamille;
	}

	/**
	 * @return idFamille
	 */
	public int getIdFamille() {
		return idFamille;
	}	

	/**
	 * @return libelleFamille
	 */
	public String getLibelleFamille() {
		return libelleFamille;
	}

	/**
	 * @param idFamille
	 */
	public void setIdFamille(int idFamille) {
		this.idFamille = idFamille;
	}

	/**
	 * @param libelleFamille
	 */
	public void setLibelleFamille(String libelleFamille) {
		this.libelleFamille = libelleFamille;
	}

	/**
	 * @see bean.IFiltrable#getId()
	 */
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return idFamille;
	}

	/**
	 * @see bean.IFiltrable#getLibelle()
	 */
	@Override
	public String getLibelle() {
		// TODO Auto-generated method stub
		return libelleFamille;
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
