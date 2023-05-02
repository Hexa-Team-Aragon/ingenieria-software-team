package com.ico.smvc.controller;

import com.ico.smvc.models.Cancion;
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

    @GetMapping("/")
    public ResponseEntity<HashMap<Integer, Cancion>> getLista() {
        return new ResponseEntity<>(playlist.getPl(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cancion> getCancion(@PathVariable(required = true, name = "id") int id) {
        return new ResponseEntity<>(playlist.buscarId(id), HttpStatus.OK);
    }

    @PostMapping("/agregar/")
    public ResponseEntity<Boolean> agregarCancion(@RequestBody Cancion laCancion) {
        return new ResponseEntity<>(playlist.agregar(laCancion), HttpStatus.OK);
    }
    //Delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> eliminarCancion(@PathVariable(required = true, name = "id") int id) {
        return new ResponseEntity<>(playlist.eliminar(id), HttpStatus.OK);
    }
}
