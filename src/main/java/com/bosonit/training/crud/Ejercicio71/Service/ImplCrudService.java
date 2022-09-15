package com.bosonit.training.crud.Ejercicio71.Service;

import com.bosonit.training.crud.Ejercicio71.Persona;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.*;

@Service
public class ImplCrudService implements CrudService {



    @Override
    public Persona mostrarporId(@PathVariable Integer id) {
        List<Persona> userList = new ArrayList<>();
        userList.add(new Persona(1, "alejandra", 25, "Madrid"));
        userList.add(new Persona(2, "miria", 25, "Madrid"));
        userList.add(new Persona(3, "rocio", 25, "Madrid"));
        userList.add(new Persona(4, "maria", 25, "Madrid"));

        for (Persona task : userList) {
            if (task.getId() == (id)) {
                return task;
            }
        }
        return null;
    }

    @Override
    public Persona mostrarpornombre(@PathVariable String name) {
        List<Persona> userList = new ArrayList<>();
        userList.add(new Persona(1, "alejandra", 25, "Madrid"));
        userList.add(new Persona(2, "mirian", 25, "Madrid"));
        userList.add(new Persona(3, "rocio", 25, "Madrid"));
        userList.add(new Persona(4, "maria", 25, "Madrid"));

        for (Persona task : userList) {
            if (task.getName().equals(name)) {
                return task;
            }
        }
        return null;
    }


    @Override
    public Persona update(int id, Persona persona) {
        List<Persona> listPersonas = new ArrayList<>();
        try {
            if (id - 1 >= listPersonas.size() || id - 1 < 0)
                throw new Exception("Person do not exist");

            Persona personatoList = listPersonas.get(id - 1);

            Optional<String> newname = Optional.ofNullable(persona.getName());
            Optional<String> newnity = Optional.ofNullable(persona.getCity());

            persona.setName(newname.isPresent() ? persona.getName() : personatoList.getName());
            persona.setCity(newnity.isPresent() ? persona.getCity() : personatoList.getCity());
            if (persona.getAge() < 0 || persona.getAge() > 120)
                persona.setAge(personatoList.getAge());

            listPersonas.set(id - 1, persona);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        List<Persona> listPersonas = new ArrayList<>();
        listPersonas.remove(id);

    }


}
