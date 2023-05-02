package com.ico.smvc.models;

import lombok.*;

import java.util.HashMap;


@Getter
@Setter
@ToString
public class Playlist {
    private HashMap<Integer, Cancion> pl;

    public Playlist(HashMap<Integer, Cancion> pl) {
        this.pl = pl;
    }

    public Playlist() {
        pl = new HashMap<>();

        pl.put(1, new Cancion("Dakiti", "El Último Tour Del Mundo", "Bad Bunny", "Reggaeton", 2020, "https://url-imagen-dakiti.com"));
        pl.put(2, new Cancion("Callaíta", "Un verano sin ti", "Bad Bunny & Tainy", "Reggaeton", 2019, "https://url-imagen-callaíta.com"));
        pl.put(3, new Cancion("Mía", "X 100PRE", "Bad Bunny ft. Drake", "Reggaeton", 2018, "https://url-imagen-mia.com"));
        pl.put(4, new Cancion("Safaera", "YHLQMDLG", "Bad Bunny, Jowell & Randy, Ñengo Flow", "Reggaeton", 2020, "https://url-imagen-safaera.com"));
        pl.put(5, new Cancion("La Canción", "OASIS", "Bad Bunny ft. J Balvin", "Reggaeton", 2020, "https://url-imagen-la-cancion.com"));
        pl.put(6, new Cancion("One", "All Yours", "ASTRO", "K-Pop", 2019, "https://url-imagen-one.com"));
        pl.put(7, new Cancion("Knock", "GATEWAY", "ASTRO", "K-Pop", 2020, "https://url-imagen-knock.com"));
        pl.put(8, new Cancion("Crazy Sexy Cool", "Dream Part.02", "ASTRO", "K-Pop", 2017, "https://url-imagen-crazy-sexy-cool.com"));
        pl.put(9, new Cancion("After Midnight", "Switch On", "ASTRO", "K-Pop", 2021, "https://url-imagen-after-midnight.com"));
        pl.put(10, new Cancion("Blue Flame", "Blue Flame", "ASTRO", "K-Pop", 2019, "https://url-imagen-blue-flame.com"));

    }

    public Cancion buscarId(int id){
        if (pl.containsKey(id)){
            return pl.get(id);
        }
        return null;
    }

}
