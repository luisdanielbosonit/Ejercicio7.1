package com.bosonit.training.crud.Ejercicio71;


import lombok.Data;

@Data
public class Persona {

    public Integer id;
    public String name;
    public Integer age;
    public String city;

    public Persona(){
    }

    public Persona(Integer id, String name, Integer age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }
}
