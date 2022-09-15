package com.bosonit.training.crud.Ejercicio71.Controller;

import com.bosonit.training.crud.Ejercicio71.Persona;
import com.bosonit.training.crud.Ejercicio71.Service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona")
public class PostController {

    @Autowired
    private CrudService service;


    @PostMapping("/post")
    public Persona persona(@RequestBody Persona persona) {
        return persona;


    }
}
