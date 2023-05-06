package com.example.zoo.repository;

import com.example.zoo.entity.Animal;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,String>
{

    public abstract List<Animal> readAnimalById(String id, Pageable pageable);
}