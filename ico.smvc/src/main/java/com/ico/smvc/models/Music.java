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
}
