package com.ico.smvc.models;

import lombok.*;

import java.util.HashMap;


@Getter
@Setter
@ToString
public class Playlist {
    private HashMap<Integer, Music> pl;

    public Playlist(HashMap<Integer, Music> pl) {
        this.pl = pl;
    }

    public Playlist() {
        pl = new HashMap<>();
        pl.put(1, new Music("Dakiti", "El Último Tour Del Mundo", "Bad Bunny", "Reggaeton", 2020, "https://url-imagen-dakiti.com"));
        pl.put(2, new Music("Callaíta", "Un verano sin ti", "Bad Bunny & Tainy", "Reggaeton", 2019, "https://url-imagen-callaíta.com"));
        pl.put(3, new Music("Mía", "X 100PRE", "Bad Bunny ft. Drake", "Reggaeton", 2018, "https://url-imagen-mia.com"));
        pl.put(4, new Music("Safaera", "YHLQMDLG", "Bad Bunny, Jowell & Randy, Ñengo Flow", "Reggaeton", 2020, "https://url-imagen-safaera.com"));
        pl.put(5, new Music("La Canción", "OASIS", "Bad Bunny ft. J Balvin", "Reggaeton", 2020, "https://url-imagen-la-cancion.com"));
        pl.put(6, new Music("One", "All Yours", "ASTRO", "K-Pop", 2019, "https://url-imagen-one.com"));
        pl.put(7, new Music("Knock", "GATEWAY", "ASTRO", "K-Pop", 2020, "https://url-imagen-knock.com"));
        pl.put(8, new Music("Crazy Sexy Cool", "Dream Part.02", "ASTRO", "K-Pop", 2017, "https://url-imagen-crazy-sexy-cool.com"));
        pl.put(9, new Music("After Midnight", "Switch On", "ASTRO", "K-Pop", 2021, "https://url-imagen-after-midnight.com"));
        pl.put(10, new Music("Blue Flame", "Blue Flame", "ASTRO", "K-Pop", 2019, "https://url-imagen-blue-flame.com"));
    }

    public Music getMusicByKey(int key){
        if (pl.containsKey(key)){
            return pl.get(key);
        }
        return new Music();
    }

    public boolean deleteMusic(int key){
        if (pl.containsKey(key)){
            pl.remove(key);
            return true;
        }
        return false;
    }

    public boolean addMusic(Music c){
        int id;
        id = pl.size()+1;
        pl.put(id, c);
        return true;
    }

}
