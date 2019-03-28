package bean;

/**
 * @author florianpuzenat
 * interface created to unify (suppress fake casting problem) filters
 * @see bean.Famille
 * @see bean.SSFamille
 * @see bean.Marque
 * @see bean.Couleur
 */
public interface IFiltrable {

	public int getId();
	
	public String getLibelle();
	
	public String getColor();
}
