package com.example.musica.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class cancion {
    private int id;
    private String nombre;
    private String artista;
    private String genero;
    private int anio;
}
