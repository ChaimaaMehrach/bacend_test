package com.example.test.Controller;

import com.example.test.Service.TaxeTnbService;
import com.example.test.entities.TaxeTnb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/TaxeTnb")
public class TaxeTnbController {
	@Autowired
	TaxeTnbService taxetnbService;

	@PostMapping("/save")
	public <S extends TaxeTnb> S save(@RequestBody S entity) {
		return taxetnbService.save(entity);
	}

	@GetMapping("/findAll")
	public List<TaxeTnb> findAll() {
		return taxetnbService.findAll();
	}

	@GetMapping("/findById/{id}")
	public Optional<TaxeTnb> findById(@PathVariable Integer id) {
		return taxetnbService.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		taxetnbService.deleteById(id);
	}
	
	
}
