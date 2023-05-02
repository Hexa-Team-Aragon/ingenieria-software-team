package com.ico.smvc.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Cancion {
    private String nombre;
    private String album;
    private String artista;
    private String genero;
    private int anio;
    private String urlImagen;
}
