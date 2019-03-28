package bean;

import java.util.List;
import service.ServiceFiltre;



/**
 * @author florianpuzenat
 *
 * Class used to stock beans within our session
 */
public class BeanBrowser {
	//User Bean
	private User client;
	//Filtre Bean
	private List<BlocFiltre> listBlocFiltre;
	
	private List<Article> listArticle;
	
	
	
	/**
	 * Constructeur
	 * instancie user et filtre
	 */	
	public BeanBrowser() {
		this.client = new User();
		this.listBlocFiltre = new ServiceFiltre().createFiltre();
	}
	
	/**
	 * @return le client
	 */
	public User getClient() {
		return client;
	}
	/**
	 * @param client
	 */
	public void setClient(User client) {
		this.client = client;
	}

	/**
	 * @return list des blocs filtres
	 */
	public List<BlocFiltre> getListBlocFiltre() {
		return listBlocFiltre;
	}

	/**
	 * @param listBlocFiltre
	 */
	public void setListBlocFiltre(List<BlocFiltre> listBlocFiltre) {
		this.listBlocFiltre = listBlocFiltre;
	}
	
	

	/**
	 * @return liste des articles
	 */
	public List<Article> getListArticle() {
		return listArticle;
	}

	/**
	 * @param listArticle
	 */
	public void setListArticle(List<Article> listArticle) {
		this.listArticle = listArticle;
	}
	
	/**
	 * @param listBlocFiltre
	 * @return oracle request to select articles
	 */
	public String getRequeteFiltre() {
		
		String requete = "SELECT * FROM coloriser ";
		String sWhere = "WHERE ";
		String sRequeteProduit = " ID_PRODUIT IN (SELECT ID_PRODUIT FROM produit WHERE ";
		String sParenthese= " ) ";
		
		for (BlocFiltre indiceBlocFiltre : this.listBlocFiltre)
		{
		// si l'un des 4 est non null il faut un WHERE, 
		//	si l'un des 3 premieres est non null il faut un select produit, 
		//	si l'un des 3 premiers et le 4 sont non null il faut  un AND entre les deux
			String s = indiceBlocFiltre.getINSQL();

			if (s !=null) {
				
				if (		indiceBlocFiltre.getIdBlocFiltre()== 0 
						||	indiceBlocFiltre.getIdBlocFiltre()== 1 
						||	indiceBlocFiltre.getIdBlocFiltre()== 2 )
				{
					requete += sWhere + sRequeteProduit ;
					sRequeteProduit = "";
					sWhere = "";
				}
				
				switch (	indiceBlocFiltre.getIdBlocFiltre()) {
	            
				case 0:		requete += "ID_FAMILLE " + s;
	                  		break;
				case 1:		requete += "ID_SSFAMILLE " + s;
              				break;
				case 2:		requete += "ID_FABRICANT " + s;
              				break;
				case 3:		if (sRequeteProduit.equals("")) {
								requete += ") AND ";
								sParenthese= "";
							}
							requete += sWhere + "ID_COULEUR " + s;
							break;
				default:	break;
	            }
				
			}
			
		}
		if (sWhere == "") {
			requete += sParenthese ;
		}
		requete += " ;";
		return requete;
	}
}
