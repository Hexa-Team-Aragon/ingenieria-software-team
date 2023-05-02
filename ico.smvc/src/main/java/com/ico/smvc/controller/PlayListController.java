package com.ico.smvc.controller;

import com.ico.smvc.models.Music;
import com.ico.smvc.models.Playlist;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class PlayListController {
    Playlist playlist;

    public PlayListController(){
        playlist = new Playlist();
    }

    //GET
    @GetMapping("/")
    public ResponseEntity<HashMap<Integer, Music>> getMusic() {
        return new ResponseEntity<>(playlist.getPl(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Music> getMusicByKey(@PathVariable(required = true, name = "id") int id) {
        return new ResponseEntity<>(playlist.getMusicByKey(id), HttpStatus.OK);
    }

    //POST
    @PostMapping("/agregar/")
    public ResponseEntity<Boolean> addMusic(@RequestBody Music laCancion) {
        return new ResponseEntity<>(playlist.addMusic(laCancion), HttpStatus.OK);
    }

    //DELETE
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteMusic(@PathVariable(required = true, name = "id") int id) {
        return new ResponseEntity<>(playlist.deleteMusic(id), HttpStatus.OK);
    }
}
