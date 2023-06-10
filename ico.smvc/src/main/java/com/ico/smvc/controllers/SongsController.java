package com.ico.smvc.controllers;

import com.ico.smvc.models.entities.Song;
import com.ico.smvc.persistence.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SongsController {
    @Autowired
    private SongRepository songRepo;
    //private SongRepositoryC songRepoC;

    @GetMapping("/playlist/{id}")
    public ResponseEntity<Optional<Song>> getSong(@PathVariable int id){
        return new ResponseEntity<>(songRepo.findById(id), HttpStatus.OK);
    }

    @GetMapping("/playlist")
    public ResponseEntity<List<Song>> getSongs(){
        return new ResponseEntity<>((List<Song>) songRepo.findAll(), HttpStatus.OK);
    }

    @PostMapping("/playlist/create")
    public ResponseEntity<Song> createSong(@RequestBody Song laSong){
        return new ResponseEntity<>(songRepo.save(laSong), HttpStatus.OK);
    }

    @PatchMapping("/playlist/update")
    public ResponseEntity<Song> saveSong(@RequestBody Song laSong){
        return new ResponseEntity<>(songRepo.save(laSong), HttpStatus.OK);
    }

    @DeleteMapping("/playlist/delete/{id}")
    public ResponseEntity<?> deleteSong(@PathVariable int id){
        songRepo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
/*
    @Query("select id, name, album, artist, genre, year , url_image from canciones where album = \"\";")
    abstract List<Song> findAll();
*/
    @GetMapping("/playlist/album/{album}")
    public ResponseEntity<List<Song>> getAlbum(@PathVariable String album){
        return new ResponseEntity<>(songRepo.findByalbum(album), HttpStatus.OK);
    }

}
