package com.ico.smvc.persistence;

import com.ico.smvc.models.entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SongRepository extends CrudRepository<Song,Integer> {
    @Query(value="SELECT * FROM canciones WHERE album = :album", nativeQuery = true)
    List<Song> findByalbum(@Param ("album") String album);
}
