package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Valorant;
import com.example.demo.repository.ValorantRepository;





@Service
public class ValorantService {
	
	private ValorantRepository valorepo;
	
	public List<Valorant> getAll(){
		return valorepo.findAll();
	}

	

	public ValorantService(ValorantRepository valorepo) {
		super();
		this.valorepo = valorepo;
	}

	public ValorantRepository getValorantRepository() {
		return valorepo;
	}

	public void setPowercardRepository(ValorantRepository valorepo) {
		this.valorepo = valorepo;
	}

}
