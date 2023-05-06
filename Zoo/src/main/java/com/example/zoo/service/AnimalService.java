package com.example.zoo.service;

import com.example.zoo.entity.Animal;
import com.example.zoo.repository.AnimalRepository;
import com.example.zoo.resource.ResourceOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.print.Pageable;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Qualifier(value="a")
public class AnimalService
{
    //member variable
    @Autowired private AnimalRepository animalRepository;


    //member method
    //read
    public Animal readAnimal(String id){return animalRepository.findById(id).orElse(null);}
    public List<Animal> readAllAnimals(){return animalRepository.findAll();}
    public List<Animal> readAllAnimalsWithPagination(int page, int size) {return animalRepository.findAll(PageRequest.of(page,size)).get().collect(Collectors.toList());}
    public List<Animal> readAnimalByIdWithPagination(String id,int page,int size){return animalRepository.readAnimalById(id,PageRequest.of(page,size));}

    //create®
    public String createAnimal(Animal animal)
    {
        if(this.readAnimal(animal.getId())!=null)return "id already existed, not create";
        animalRepository.save(animal);
        return "created";
    }
    public String createThreeAnimals()
    {
        animalRepository.saveAll(ResourceOne.threeAnimals);
        return "created";
    }

    //delete
    public String deleteAnimal(String id)
    {
        if(this.readAnimal(id)==null)return "id not existed, not delete";
        animalRepository.deleteById(id);
        return "deleted";
    }

    //update
    public String updateAnimal(String id,String state)
    {
        if(this.readAnimal(id)==null)return "id not existed, not update";
        Animal animal=this.readAnimal(id);animal.setState(state);
        animalRepository.save(animal);
        return "updated";
    }
}