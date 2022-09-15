package com.bosonit.training.crud.Ejercicio71.Service;

import com.bosonit.training.crud.Ejercicio71.Persona;

import java.util.List;

public interface CrudService {



    public Persona mostrarporId(Integer id);

    public Persona mostrarpornombre(String name);

    //public Persona update(Persona persona);

    public Persona update(int id, Persona persona);


    public void delete(Integer id);



}
