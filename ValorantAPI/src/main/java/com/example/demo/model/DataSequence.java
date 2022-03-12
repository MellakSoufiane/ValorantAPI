package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="datasequence")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataSequence {
	
	@Id
    private String id;
 
    private int seq;

	


    
}
