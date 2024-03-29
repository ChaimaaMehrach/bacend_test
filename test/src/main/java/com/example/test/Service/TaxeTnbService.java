package com.example.test.Service;

import com.example.test.Dao.TaxeTnbRepository;
import com.example.test.entities.TaxeTnb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaxeTnbService {
	@Autowired
	TaxeTnbRepository taxetnbRepository;

	public <S extends TaxeTnb> S save(S entity) {
		return taxetnbRepository.save(entity);
	}

	public List<TaxeTnb> findAll() {
		return taxetnbRepository.findAll();
	}

	public Optional<TaxeTnb> findById(Integer id) {
		return taxetnbRepository.findById(id);
	}

	public void deleteById(Integer id) {
		taxetnbRepository.deleteById(id);
	}

	// Calculate Tax Tnb API

	
}
