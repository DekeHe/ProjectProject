package com.example.zoo.resource;

import com.example.zoo.entity.Animal;

import java.util.Arrays;
import java.util.List;

public class ResourceOne
{
    public static List<Animal> threeAnimals= Arrays.asList(
            new Animal("1","dog",1,"not adopted"),
            new Animal("2","dog",1,"adopted"),
            new Animal("3","dog",1,"adopted")
    );
}