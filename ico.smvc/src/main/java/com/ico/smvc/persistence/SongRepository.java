package com.ico.smvc.persistence;

import com.ico.smvc.models.entities.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song,Integer> {
}
