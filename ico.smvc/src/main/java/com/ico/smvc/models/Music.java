package com.ico.smvc.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Music {
    private String name;
    private String album;
    private String artist;
    private String gender;
    private int age;
    private String image;

    public void update(Music music){
        this.name = music.getName();
        this.album = music.getAlbum();
        this.artist = music.getArtist();
        this.gender = music.getGender();
        this.age = music.getAge();
        this.image = music.getImage();
    }
}
