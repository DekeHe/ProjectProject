package com.example.zoo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Animal")
@NoArgsConstructor
@AllArgsConstructor
public class Animal
{
    @Id @Setter @Getter private String id;
    @Setter @Getter private String type;
    @Setter @Getter private int age;
    @Setter @Getter private String state;
}