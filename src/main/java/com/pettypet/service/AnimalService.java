package com.pettypet.service;

import java.util.List;

import com.pettypet.model.Animal;

public interface AnimalService {
	public Animal save(Animal info);
	public List<Animal> findAll();
}
