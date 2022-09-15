package com.bosonit.training.crud.Ejercicio71.Controller;

import com.bosonit.training.crud.Ejercicio71.Persona;
import com.bosonit.training.crud.Ejercicio71.Service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("persona")
public class DeleteController {

    @Autowired
    CrudService service;

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        service.delete(id);

        return "persona borrada";
    }
}
