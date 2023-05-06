package com.example.zoo.controller;

import com.example.zoo.entity.Animal;
import com.example.zoo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.net.http.HttpClient;
import java.util.List;

@RestController
@RestControllerAdvice
public class AnimalController
{
    //member variable
    @Autowired @Qualifier(value="a") private AnimalService animalService;
    //member method
    //read
    @GetMapping(value="/read/animal")
    public Animal readAnimal(@RequestParam(value="id") String id)
    {
        if(id.length()>1)throw new HttpClientErrorException(HttpStatusCode.valueOf(400),"id too long");
        return animalService.readAnimal(id);
    }
    @GetMapping(value="/read/animal1")
    public Animal readAnimal1(@RequestParam(value="id") String id){return animalService.readAnimal(String.valueOf(Integer.valueOf(id)-1));}
    @GetMapping(value="/read/animal2")
    public Animal readAnimal2(@RequestParam(value="id") String id){return animalService.readAnimal(String.valueOf(Integer.valueOf(id)-2));}
    @GetMapping(value="/read/all/animals")
    public List<Animal> readAllAnimals(){return animalService.readAllAnimals();}
    @GetMapping(value="/read/all/animals/with/pagination")
    public List<Animal> readAllAnimalsWithPagination(@RequestParam(value="page") int page, @RequestParam(value="size") int size){return animalService.readAllAnimalsWithPagination(page,size);}
    @GetMapping(value="/read/animals/by/id/with/pagination")
    public List<Animal> readAnimalsByIdWithPagination(@RequestParam(value="id") String id,@RequestParam(value="page") int page,@RequestParam(value="size") int size){return animalService.readAnimalByIdWithPagination(id,page,size);}
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

    @ExceptionHandler(value=HttpClientErrorException.class)
    public String handleHttpClientException(HttpClientErrorException hcee)
    {
        int code=hcee.getStatusCode().value();
        switch(code)
        {
            case 400:
                return "here1: "+hcee.getMessage();
        }
        return "happened error unknown";
    }

    @ExceptionHandler(value=Exception.class)
    public String handleException(Exception e){return "here2: "+e.getMessage();}
}