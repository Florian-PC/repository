package bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Class comportant des categorie(listes) de filtres
 * 
 * @author florianpuzenat Class comportant des categorie(listes) de filtres
 */
public class BlocFiltre {

	private int idBlocFiltre;
	private String libelleBlocFiltre;
	private List<Filtre> listFiltre = new ArrayList<Filtre>();

	/**
	 * Constructeur
	 */
	public BlocFiltre() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param idBlocFiltre
	 * @param libelleBlocFiltre
	 */
	public BlocFiltre(int idBlocFiltre, String libelleBlocFiltre) {
		super();
		this.idBlocFiltre = idBlocFiltre;
		this.libelleBlocFiltre = libelleBlocFiltre;
	}

	/**
	 * Constructeur
	 * 
	 * @param idBlocFiltre
	 * @param libelleBlocFiltre
	 * @param listFiltre
	 */
	public BlocFiltre(int idBlocFiltre, String libelleBlocFiltre, List<Filtre> listFiltre) {
		super();
		this.idBlocFiltre = idBlocFiltre;
		this.libelleBlocFiltre = libelleBlocFiltre;
		this.listFiltre = listFiltre;
	}

	/**
	 * @return idBlocFiltre
	 */
	public int getIdBlocFiltre() {
		return idBlocFiltre;
	}

	/**
	 * @return libelleFiltre
	 */
	public String getLibelleBlocFiltre() {
		return libelleBlocFiltre;
	}

	/**
	 * @return listFiltre
	 */
	public List<Filtre> getListFiltre() {
		return listFiltre;
	}

	/**
	 * @param idBlocFiltre
	 */
	public void setIdBlocFiltre(int idBlocFiltre) {
		this.idBlocFiltre = idBlocFiltre;
	}

	/**
	 * @param libelleBlocFiltre
	 */
	public void setLibelleBlocFiltre(String libelleBlocFiltre) {
		this.libelleBlocFiltre = libelleBlocFiltre;
	}

	/**
	 * @param listFiltre
	 */
	public void setListFiltre(List<Filtre> listFiltre) {
		this.listFiltre = listFiltre;
	}

	/**
	 * check if every or no filter are checked from listFiltre
	 * 
	 * @return true/false
	 */
	public boolean isAllChecked() {
		int i = 0;
		for (Filtre indiceFiltre : this.listFiltre) {
			if (indiceFiltre.isChecked())
				i++;
		}

		if (i == this.listFiltre.size() || i == 0) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Create part of the SQL injection to select selection items
	 * 
	 * @return String for oracle SQL
	 */
	public String getINSQL() {
		String s = "";
		if (!this.isAllChecked()) {
			for (Filtre indiceFiltre : this.listFiltre) {
				if (indiceFiltre.isChecked()) {
					if (!s.equals("")) {
						s += ", ";
					}
					s += indiceFiltre.getIdFiltre();
				}
			}
			s = ("IN( " + s + ")");
		} else {
			s = null;
		}
		return s;
	}

}
