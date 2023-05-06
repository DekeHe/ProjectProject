package com.example.zoo.controller;

import com.example.zoo.entity.Animal;
import com.example.zoo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalController
{
    //member variable
    @Autowired private AnimalService animalService;

    //member method
    //read
    @GetMapping(value="/read/animal")
    public Animal readAnimal(@RequestParam(value="id") String id){return animalService.readAnimal(id);}
    @GetMapping(value="/read/all/animals")
    public List<Animal> readAllAnimals(){return animalService.readAllAnimals();}

    //create
    @PostMapping(value="/create/animal")
    public String createAnimal(@RequestBody Animal animal){return animalService.createAnimal(animal);}

    @PostMapping(value="/create/three/animals")
    public String createThreeAnimals(){return animalService.createThreeAnimals();}
    //delete
    @DeleteMapping(value="/delete/animal")
    public String deleteAnimal(@RequestParam(value="id") String id){return animalService.deleteAnimal(id);}

    //update
    @PutMapping(value="/update/animal")
    public String updateAnimal(@RequestParam(value="id") String id,@RequestParam(value="state") String state){return animalService.updateAnimal(id,state);}
}