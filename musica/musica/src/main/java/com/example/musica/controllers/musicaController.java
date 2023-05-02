package com.example.musica.controllers;

import com.example.musica.model.cancion;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class musicaController {
    ArrayList<cancion> Canciones;

    public musicaController(){
        Canciones = new ArrayList<>();
        Canciones.add(new cancion(1,"cancion","a1","g1",2017));
        Canciones.add(new cancion(2,"cancion2","a2","g2",2021));
        Canciones.add(new cancion(3,"cancion3","a3","g3",2022));
        Canciones.add(new cancion(4,"cancion4","a4","g4",2023));
        Canciones.add(new cancion(5,"cancion5","a5","g5",2023));
    }
    @GetMapping("/inicio")
    public String getindex(){
        return "index";
    }

    @GetMapping("/inicio/canciones")
    public String getCanciones(Model model){
        model.addAttribute("Canciones",Canciones);
        return "canciones";
    }



}
