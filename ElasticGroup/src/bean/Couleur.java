package bean;

/**
 * @author florianpuzenat 
 * Bean Couleur
 */
public class Couleur implements IFiltrable {

	private int idColor;
	private String libelleColor;
	private String codeHexa;

	/**
	 * Constructeur
	 */
	public Couleur() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param idColor
	 * @param libelleColor
	 * @param codeHexa
	 */
	public Couleur(int idColor, String libelleColor, String codeHexa) {
		super();
		this.idColor = idColor;
		this.libelleColor = libelleColor;
		this.codeHexa = codeHexa;
	}

	/**
	 * @return idColor
	 */
	public int getIdColor() {
		return idColor;
	}

	/**
	 * @param idColor
	 */
	public void setIdColor(int idColor) {
		this.idColor = idColor;
	}

	/**
	 * @return libelleColor
	 */
	public String getLibelleColor() {
		return libelleColor;
	}

	/**
	 * @param libelleColor
	 */
	public void setLibelleColor(String libelleColor) {
		this.libelleColor = libelleColor;
	}

	/**
	 * @return codeHexa
	 */
	public String getcodeHexa() {
		return codeHexa;
	}

	/**
	 * @param codeHexa
	 */
	public void setcodeHexa(String codeHexa) {
		this.codeHexa = codeHexa;
	}

	/**
	 * @see bean.IFiltrable#getId()
	 */
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.idColor;
	}

	/**
	 * @see bean.IFiltrable#getLibelle()
	 */
	@Override
	public String getLibelle() {
		// TODO Auto-generated method stub
		return this.libelleColor;
	}

	/**
	 * @see bean.IFiltrable#getColor()
	 */
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.codeHexa;
	}

}
