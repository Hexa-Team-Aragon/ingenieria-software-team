package com.example.musica.controllers;

import com.example.musica.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.result.view.RedirectView;
import reactor.core.publisher.Flux;
import org.springframework.ui.Model;
import reactor.core.publisher.Mono;
import java.util.List;

@Controller
public class musicaController {

    private final WebClient webClient;

    @Autowired
    public musicaController(WebClient webClient) {
        this.webClient = webClient;
    }

    @GetMapping("/inicio")
    public String getIndex(Model model){
        model.addAttribute("songs", getSongs());
        return "index";
    }

    @GetMapping("/delete/{id}")
    public String deleteSong(@PathVariable int id, Model model){
        String url = "http://localhost:8090/api/playlist/delete/{id}";
        Mono<Void> resultMono = webClient.delete()
                .uri(url,id)
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
            @ModelAttribute("urlImage") String urlImage,
            Model model
    ) {
        Song song = new Song(0,name,album,artist,genre,year,urlImage);
        String url = "http://localhost:8090/api/playlist/create";

        Mono<String> resultMono = webClient.post()
                .uri(url)
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(song)
                .retrieve()
                .bodyToMono(String.class);
        resultMono.block();

        return "redirect:/inicio";
    }

    @PatchMapping("/update")
    public String updateSong(
            @ModelAttribute("id") int id,
            @ModelAttribute("name") String name,
            @ModelAttribute("album") String album,
            @ModelAttribute("artist") String artist,
            @ModelAttribute("genre") String genre,
            @ModelAttribute("year") int year,
            @ModelAttribute("urlImage") String urlImage,
            Model model
    ) {
        Song song = new Song(id,name,album,artist,genre,year,urlImage);
        String url = "http://localhost:8090/api/playlist/create";

        Mono<String> resultMono = webClient.patch()
                .uri(url)
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(song)
                .retrieve()
                .bodyToMono(String.class);
        resultMono.block();

        return "redirect:/inicio";
    }

    @GetMapping("/inicio/canciones")
    public String getCanciones(){
        return "canciones";
    }

    private List<Song> getSongs(){
        String url = "http://localhost:8090/api/playlist";
        Flux<Song> songsFlux = webClient.get()
                .uri(url)
                .retrieve()
                .bodyToFlux(new ParameterizedTypeReference<Song>() {
                });
        return songsFlux.collectList().block();
    }
}
