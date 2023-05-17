package com.enzomonteiro.ngoenterpriseresourceplanning.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import com.enzomonteiro.ngoenterpriseresourceplanning.dto.NgoDTO;
import com.enzomonteiro.ngoenterpriseresourceplanning.dto.NgoFindAllDTO;
import com.enzomonteiro.ngoenterpriseresourceplanning.dto.NgoInsertDTO;
import com.enzomonteiro.ngoenterpriseresourceplanning.services.NgoService;


@RestController
@RequestMapping("/ngos")
public class NgoController {
	
	@Autowired
	private NgoService ngoService; 
	
	@GetMapping
	public List<NgoFindAllDTO> findAll(){
		return ngoService.findAll();
	}
	
	@PostMapping
	public ResponseEntity<NgoDTO> save(@RequestBody NgoInsertDTO dto) {
		NgoDTO obj = ngoService.save(dto);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(uri).body(obj);
	}
}
