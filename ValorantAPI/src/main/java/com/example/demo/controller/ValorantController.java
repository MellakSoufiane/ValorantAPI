package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Valorant;
import com.example.demo.repository.ValorantRepository;
import com.example.demo.service.SequenceGeneratorService;
import com.example.demo.service.ValorantService;





@RestController

public class ValorantController {

	@Autowired
	private ValorantRepository valorepo;
	
	@Autowired
	private ValorantService valoservice;
	
	@Autowired
	private SequenceGeneratorService seqGeneratorService;
		
		public ValorantController(ValorantService valoservice) {
			this.valoservice = valoservice;
		}
		
		Logger logger = LoggerFactory.getLogger(getClass());
		
		
		
		@GetMapping("/valoAPI")
		public List<Valorant> getAll(){
			return valoservice.getAll();
		}
		
		
		
		@PostMapping("valoAPI/add")
		public Valorant create( @RequestBody Valorant newObject) {
			newObject.setId(seqGeneratorService.generateSequence(Valorant.SEQUENCE_NAME));
		 return valorepo.save(newObject);
		}
		
		@PutMapping("valoAPI/update")
		public Valorant update(@RequestBody Valorant modifiedObject) {
			return valorepo.save(modifiedObject);
		}
		
		@DeleteMapping("valoAPI/delete/{id}")
	    public String delete(@PathVariable int id){
			valorepo.deleteById(id);
	        
	        return "Deleted Successfully";
	    }
		
		 @GetMapping("/valoAPI/{id}")

		    public Optional<Valorant> getById(@PathVariable int id) {

		        logger.info("find by id : "+id);
		        Optional<Valorant> valo = valorepo.findById(id);

		        return valo;
		    }
		
		}
