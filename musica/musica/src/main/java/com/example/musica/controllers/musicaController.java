package com.example.musica.controllers;

import com.example.musica.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import org.springframework.ui.Model;
import reactor.core.publisher.Mono;

import java.net.URL;
import java.util.List;

@Controller
public class musicaController {

    private final WebClient webClient;
    private final String URL_BASE = "http://api:8090/api/playlist";

    @Autowired
    public musicaController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping("/inicio")
    public String getIndex(Model model){
        Flux<Song> songsFlux = webClient.get()
                .uri(URL_BASE)
                .retrieve()
                .bodyToFlux(new ParameterizedTypeReference<Song>() {
                });
        List<Song> songs = songsFlux.collectList().block();
        model.addAttribute("songs", songs);
        return "index";
    }

    @GetMapping("/delete/{id}")
    public String deleteSong(@PathVariable int id){
        Mono<Void> resultMono = webClient.delete()
                .uri(URL_BASE+"/delete/{id}",id)
                .retrieve()
                .bodyToMono(Void.class);
        resultMono.block();
        return "redirect:/inicio";
    }

    @PostMapping("/add")
    public String addSong(
            @ModelAttribute("name") String name,
            @ModelAttribute("album") String album,
            @ModelAttribute("artist") String artist,
            @ModelAttribute("genre") String genre,
            @ModelAttribute("year") int year,
            @ModelAttribute("urlImage") String urlImage
    ) {
        Song song = new Song(0,name,album,artist,genre,year,urlImage);
        Mono<String> resultMono = webClient.post()
                .uri(URL_BASE+"/create")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(song)
                .retrieve()
                .bodyToMono(String.class);
        resultMono.block();
        return "redirect:/inicio";
    }

    @PostMapping("/update")
    public String updateSong(
            @ModelAttribute("id") int id,
            @ModelAttribute("name") String name,
            @ModelAttribute("album") String album,
            @ModelAttribute("artist") String artist,
            @ModelAttribute("genre") String genre,
            @ModelAttribute("year") int year,
            @ModelAttribute("urlImage") String urlImage
    ) {
        Song song = new Song(id,name,album,artist,genre,year,urlImage);
        Mono<String> resultMono = webClient.patch()
                .uri(URL_BASE+"/update")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(song)
                .retrieve()
                .bodyToMono(String.class);
        resultMono.block();
        return "redirect:/inicio";
    }

    @GetMapping("/inicio/agregar")
    public String viewAddSong(){ return "agregar"; }

    @GetMapping("/view/editar/{id}")
    public String editViewSong(@PathVariable int id, Model model) {
        Mono<Song> songMono = webClient.get()
                .uri(URL_BASE+"/{id}",id)
                .retrieve()
                .bodyToMono(Song.class);
        Song result = songMono.block();
        model.addAttribute("song",result);
        return "editar";
    }

    @GetMapping("/inicio/detallesCancion/{id}")
    public String getSong(@PathVariable int id, Model model) {
        Mono<Song> songMono = webClient.get()
                .uri(URL_BASE+"/{id}",id)
                .retrieve()
                .bodyToMono(Song.class);
        Song result = songMono.block();
        model.addAttribute("song",result);
        return "detallesCancion";
    }

    @GetMapping("/inicio/detallesAlbum/{album}")
    public String getAlbum(@PathVariable String album, Model model) {
        Flux<Song> songsFlux = webClient.get()
                .uri(URL_BASE+"/album/{album}",album)
                .retrieve()
                .bodyToFlux(new ParameterizedTypeReference<Song>() {
                });
        List<Song> songs = songsFlux.collectList().block();
        model.addAttribute("songs", songs);
        return "detallesAlbum";
    }
}