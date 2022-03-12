package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Valorant;


@Repository
public interface ValorantRepository extends MongoRepository<Valorant, Integer> {

}
