package com.enzomonteiro.ngoenterpriseresourceplanning.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enzomonteiro.ngoenterpriseresourceplanning.dto.NgoDTO;
import com.enzomonteiro.ngoenterpriseresourceplanning.dto.NgoFindAllDTO;
import com.enzomonteiro.ngoenterpriseresourceplanning.dto.NgoInsertDTO;
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
	
	public NgoDTO save(NgoInsertDTO dto) {
		
		Ngo existsNgo = ngoRepository.findByEmail(dto.getEmail());
		
		if(existsNgo != null) {
			throw new Error("Já existe um usuário com esse email cadastrado!");
		}
		
		Ngo ngo = ngoRepository.save(createNgoFromDto(dto));
		return new NgoDTO(ngo);
		
	}
	
	private Ngo createNgoFromDto(NgoInsertDTO dto) {
		
		Ngo obj = new Ngo();
		obj.setName(dto.getName());
		obj.setRegistrationNumber(dto.getRegistrationNumber());
		obj.setEmail(dto.getEmail());
		obj.setPassword(dto.getPassword());
		obj.setImgUrl(dto.getImgUrl());
		obj.setSite(dto.getSite());
		obj.setState(dto.getState());
		obj.setCity(dto.getCity());
		obj.setPostalCode(dto.getPostalCode());
		obj.setDistrict(dto.getDistrict());
		obj.setAddress(dto.getAddress());
		obj.setAddressNumber(dto.getAddressNumber());
		obj.setAddressComplement(dto.getAddressComplement());
		obj.setTelephone(dto.getTelephone());
		obj.setDescription(dto.getDescription());
		
		return obj;
		
		
	}
	
}
