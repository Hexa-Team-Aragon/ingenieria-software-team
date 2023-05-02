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

    @GetMapping("/{key}")
    public ResponseEntity<Music> getMusicByKey(@PathVariable(required = true, name = "key") int key) {
        return new ResponseEntity<>(playlist.getMusicByKey(key), HttpStatus.OK);
    }

    //POST
    @PostMapping("/add/")
    public ResponseEntity<Boolean> addMusic(@RequestBody Music music) {
        return new ResponseEntity<>(playlist.addMusic(music), HttpStatus.OK);
    }

    //DELETE
    @DeleteMapping("/delete/{key}")
    public ResponseEntity<Boolean> deleteMusic(@PathVariable(required = true, name = "key") int key) {
        return new ResponseEntity<>(playlist.deleteMusic(key), HttpStatus.OK);
    }

    //PATCH
    @PatchMapping("/patch/")
    public ResponseEntity<Music> patchMusic(@RequestBody int key ,@RequestBody Music music){
        return new ResponseEntity<>(playlist.updateMusic(key,music),HttpStatus.OK);
    }
}
