package service;

import java.util.ArrayList;
import java.util.List;

import bean.BlocFiltre;
import bean.Filtre;
import bean.IFiltrable;
import model.DAO;
import model.DAOCouleur;
import model.DAOFamille;
import model.DAOMarque;
import model.DAOSSFamille;

public class ServiceFiltre {

	/**
	 * Create a list of bloc Filtre from selected database
	 * 
	 * @return listBlocFiltre
	 */
	@SuppressWarnings({ "rawtypes", "serial", "unchecked" })
	public List<BlocFiltre> createFiltre() {
		// create a blocFiltre for eache type of filter

		// List DAO which need filtering (néologisme)
		List<DAO> listDAO = new ArrayList<DAO>() {
			{
				add(new DAOFamille());
				add(new DAOSSFamille());
				add(new DAOMarque());
				add(new DAOCouleur());
			}
		};

		List<BlocFiltre> listBlocFiltre = new ArrayList<BlocFiltre>();

		// for each element of the DAO list
		for (DAO indiceDAO : listDAO) {
			// And... too lazy to translate something nobody gonna read :-)
			// Préparation de la liste des filtres pour le constructeur des BlocFiltre
			List<Filtre> listFiltre = new ArrayList<Filtre>();

			// Utilisation d'une interface IFiltrable pour tout les differents types
			// de class à filtrer ( création d'une liste (casting) variable )
			List<IFiltrable> listFiltrable = new ArrayList<IFiltrable>();
			listFiltrable = (List<IFiltrable>) indiceDAO.findAll();

			// Pour Chaque Filtre d'un bloc, l'ajouter à sa liste de Filtre
			for (IFiltrable indiceFiltre : listFiltrable) {
				listFiltre.add(new Filtre(indiceFiltre.getId(), indiceFiltre.getLibelle(), indiceFiltre.getColor()));
			}

			// Creation du BlocFiltre avec l'index de la DAO, le nom donné à la Table et la
			// liste de Filtres
			listBlocFiltre.add(new BlocFiltre(listDAO.indexOf(indiceDAO), indiceDAO.getNomTable(), listFiltre));
		}

		return listBlocFiltre;
	}

}
