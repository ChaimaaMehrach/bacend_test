package com.example.test.Service;

import com.example.test.Dao.CategorieRepository;
import com.example.test.Dao.TauxRepository;
import com.example.test.Dao.TaxeTnbRepository;
import com.example.test.Dao.TerrainRepository;
import com.example.test.entities.Categorie;
import com.example.test.entities.Taux;
import com.example.test.entities.TaxeTnb;
import com.example.test.entities.Terrain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TauxService {
	@Autowired
	TaxeTnbRepository taxeTnbRepository;
	@Autowired
	TauxRepository tauxRepository;
	@Autowired
	CategorieRepository categorieRepository;
	@Autowired
	TerrainRepository terrainRepository;
	public <S extends Taux> S save(S entity) {
		return tauxRepository.save(entity);
	}

	public List<Taux> findAll() {
		return tauxRepository.findAll();
	}

	public Optional<Taux> findById(Integer id) {
		return tauxRepository.findById(id);
	}

	public void deleteById(Integer id) {
		tauxRepository.deleteById(id);
	}

	public Double calculateTaxTnb(int idTerrain) {
		Double taxRate = 0.0; // Replace with your actual tax rate
		//double baseTax = mc * taxRate;
		Optional<Terrain> terrain = terrainRepository.findById(idTerrain);
		int mc = terrain.get().getMc();
		Categorie categorie = terrain.get().getCategorie();
		Optional<TaxeTnb> taxeTnb = taxeTnbRepository.findByCategorie(categorie);

		double montantbase = taxeTnb.get().getMontantbase();



		// You can also consider categorie in your calculation
		// Replace the following logic with your actual implementation
		if (categorie != null ) {
			taxRate = ( mc * montantbase)+100.00; // Apply a factor for commercial properties
		}

		return taxRate;
	}

}
