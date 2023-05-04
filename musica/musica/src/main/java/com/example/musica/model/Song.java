package com.example.musica.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Song {
    private int id;
    private String name;
    private String album;
    private String artist;
    private String genre;
    private int year;
    private String urlImage;
}
