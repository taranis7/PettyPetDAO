package com.pettypet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pettypet.model.Animal;
import com.pettypet.repo.AnimalRepository;

@Service("animalService")
public class AnimalServiceImpl implements AnimalService {

	@Autowired
	private AnimalRepository animalRepository;

	public Animal save(Animal info) {
		return animalRepository.save(info);
	}
	
	public List<Animal> findAll() {
		return animalRepository.findAll();
	}
}