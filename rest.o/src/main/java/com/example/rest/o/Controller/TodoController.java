package com.example.rest.o.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {


    @GetMapping(value = "/")
    public String Saludo (){
        return "HOLA DuMÚN";
    }
}
