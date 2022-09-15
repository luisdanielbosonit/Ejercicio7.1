package com.bosonit.training.crud.Ejercicio71.Controller;

import com.bosonit.training.crud.Ejercicio71.Persona;
import com.bosonit.training.crud.Ejercicio71.Service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("persona")
public class PutController {


    @Autowired
    private CrudService service;

    @PutMapping("/{id}")

    public String update(@PathVariable int id, @RequestBody Persona persona){
        service.update(id,persona);

        return "persona modificada";
    }


}







