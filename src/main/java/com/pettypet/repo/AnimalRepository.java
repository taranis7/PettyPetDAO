package com.pettypet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pettypet.model.Animal;

@Repository("animalRepository")
public interface AnimalRepository extends JpaRepository<Animal, Long> {
	@Query("select s from Animal s where s.name = :animalName and s.type = :type")
	Animal findByAnimalNameAndType(@Param("animalName") String animalName, @Param("type") String type);
}
