package com.enzomonteiro.ngoenterpriseresourceplanning.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.enzomonteiro.ngoenterpriseresourceplanning.dto.NgoDTO;
import com.enzomonteiro.ngoenterpriseresourceplanning.services.NgoService;

@RestController
@RequestMapping("/ngos")
public class NgoController {
	
	@Autowired
	private NgoService ngoService; 
	
	@GetMapping
	public List<NgoDTO> findAll(){
		return ngoService.findAll();
	}
}
