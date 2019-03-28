package bean;

/**
 * @author florianpuzenat
 * bean Filtre
 */
public class Filtre {

	private int idFiltre;
	private String libelleFiltre;
	private String colorFiltre;
	private boolean checked;
	
	/**
	 * Constructeur
	 */
	public Filtre() {
		super();
		checked = false;
	}

	/**
	 * Constructeur
	 * @param idFiltre
	 * @param libelleFiltre
	 */
	public Filtre(int idFiltre, String libelleFiltre) {
		super();
		this.idFiltre = idFiltre;
		this.libelleFiltre = libelleFiltre;
		this.checked = false;
		this.colorFiltre = null;
	}
	
	/**
	 * Constructeur
	 * @param idFiltre
	 * @param libelleFiltre
	 * @param colorFiltre
	 */
	public Filtre(int idFiltre, String libelleFiltre, String colorFiltre) {
		super();
		this.idFiltre = idFiltre;
		this.libelleFiltre = libelleFiltre;
		this.checked = false;
		this.colorFiltre = colorFiltre;
	}

	/**
	 * @return idFiltre
	 */
	public int getIdFiltre() {
		return idFiltre;
	}

	/**
	 * @return libelleFiltre
	 */
	public String getLibelleFiltre() {
		return libelleFiltre;
	}

	/**
	 * @return if checked (from checkbox)
	 */
	public boolean isChecked() {
		return checked;
	}
	
	/**
	 * @return String if checked (from checkbox)
	 */
	public String getChecked() {
		if (checked) {
			return "checked";
		}else {
			return "";
		}
	}

	/**
	 * @return colorFiltre
	 */
	public String getColorFiltre() {
		return colorFiltre;
	}
	
	/**
	 * @param idFiltre
	 */
	public void setIdFiltre(int idFiltre) {
		this.idFiltre = idFiltre;
	}

	/**
	 * @param libelleFiltre
	 */
	public void setLibelleFiltre(String libelleFiltre) {
		this.libelleFiltre = libelleFiltre;
	}

	/**
	 * @param checked
	 */
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	
	/**
	 * @param colorFiltre 
	 */
	public void setcolorFiltre(String colorFiltre) {
		this.colorFiltre=colorFiltre;
	}
	
	
	
	
	
}
