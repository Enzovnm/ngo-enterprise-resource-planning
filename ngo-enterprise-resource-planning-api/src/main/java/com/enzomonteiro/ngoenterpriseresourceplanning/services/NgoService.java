package com.enzomonteiro.ngoenterpriseresourceplanning.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enzomonteiro.ngoenterpriseresourceplanning.dto.NgoFindAllDTO;
import com.enzomonteiro.ngoenterpriseresourceplanning.entities.Ngo;
import com.enzomonteiro.ngoenterpriseresourceplanning.repositories.NgoRepository;

@Service
public class NgoService {
	
	@Autowired
	private NgoRepository ngoRepository;
	
	public List<NgoFindAllDTO> findAll(){
		List<Ngo> result = ngoRepository.findAll();
		return result.stream().map(x -> new NgoFindAllDTO(x)).toList();
	}
	
	
}
