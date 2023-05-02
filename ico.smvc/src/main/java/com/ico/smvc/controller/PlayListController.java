package com.ico.smvc.controller;

import com.ico.smvc.models.Cancion;
import com.ico.smvc.models.Playlist;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class PlayListController {
    Playlist playlist;

    public PlayListController(){
        playlist = new Playlist();
    }

    @GetMapping("/")
    public ResponseEntity<HashMap<Integer, Cancion>> getLista() {
        return new ResponseEntity<>(playlist.getPl(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cancion> getCancion(@PathVariable(required = true, name = "id") int id) {
        return new ResponseEntity<>(playlist.buscarId(id), HttpStatus.OK);
    }
}
