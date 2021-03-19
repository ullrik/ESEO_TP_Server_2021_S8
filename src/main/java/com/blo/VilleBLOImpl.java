package com.blo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.VilleDAO;
import com.dto.Ville;

@Service
public class VilleBLOImpl implements VilleBLO {

	@Autowired
	private VilleDAO villeDAO;
	
	public ArrayList<Ville> getInfoVille(String monParam) {
		ArrayList<Ville> listeVille = null;
		
		if (monParam == null) {
			 listeVille = villeDAO.findAllVilles();
		} else {
			listeVille = villeDAO.findAllVilles();
			//listeVille = villeDAO.findVillesWithParams(monParam);
		}
		
		return listeVille;
	}

}
