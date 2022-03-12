package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="Valorant")
public class Valorant {
	@Transient
	public static final String SEQUENCE_NAME = "Valorants_sequence"; 
	
	 @Id
	  private int id;

	 
   private String PlayerName;
   private String AgentName;
   private int ACS;
   private int K;
}
