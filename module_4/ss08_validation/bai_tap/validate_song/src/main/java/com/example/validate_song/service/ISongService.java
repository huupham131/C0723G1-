package com.example.validate_song.service;

import com.example.validate_song.model.Song;

import java.util.List;
import java.util.Optional;

public interface ISongService {
    List<Song> showList();

    Optional<Song> findById(int id);


    void save(Song song);

    void update( Song song);
}
