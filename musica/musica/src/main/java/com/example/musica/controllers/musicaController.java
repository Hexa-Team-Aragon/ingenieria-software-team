package com.example.musica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class musicaController {
    @GetMapping("/inicio")
    public String getindex(){
        return "index";
    }

    @GetMapping("/inicio/canciones")
    public String getCanciones(){
        return "canciones";
    }



}
