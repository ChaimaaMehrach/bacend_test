package com.example.test.Controller;

import com.example.test.Service.TauxService;
import com.example.test.entities.Taux;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Taux")
public class TauxController {
	
	@Autowired
	TauxService tauxService;

	@PostMapping("/save")
	public <S extends Taux> S save(@RequestBody S entity) {
		return tauxService.save(entity);
	}
	
	@GetMapping("/findAll")
	public List<Taux> findAll() {
		return tauxService.findAll();
	}

	@GetMapping("/findById/{id}")
	public Optional<Taux> findById(@PathVariable Integer id) {
		return tauxService.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		tauxService.deleteById(id);
	}

	@GetMapping("/calculateTaxTnb/{idTerrain}")
	public Double calculateTaxTnb(@PathVariable int idTerrain) {
		return tauxService.calculateTaxTnb(idTerrain);
	}
}
