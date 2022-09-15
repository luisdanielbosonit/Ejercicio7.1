package com.bosonit.training.crud.Ejercicio71.Controller;

import com.bosonit.training.crud.Ejercicio71.Persona;
import com.bosonit.training.crud.Ejercicio71.Service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/persona")
public class GetController {

    @Autowired
    private CrudService service;

    @GetMapping("/get/{id}")
    public Persona index(@PathVariable Integer id){
        return service.mostrarporId(id);
    }

    @GetMapping("/nombre/{name}")
    public Persona Index(@PathVariable String name){
        return service.mostrarpornombre(name);
    }


}
