package com.example.validate_song.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SongDto {
    @NotEmpty
    @Size(min = 1, max = 800, message = "Length of song name must not exceed 800 characters")
    @Pattern(regexp = "^[a-zA-Z0-9 ]+", message = "Song name can't include special characters")
    private String name;

    @NotEmpty
    @Size(min = 1, max = 300, message = "Length of singer name must not exceed 300 characters")
    @Pattern(regexp = "^[a-zA-Z0-9 ]+", message = "Singer name can't include special characters)")
    private String singer;

    @NotEmpty
    @Size(min = 1, max = 1000, message = "Genre must not exceed 1000 characters")
    @Pattern(regexp = "^[a-zA-Z0-9, ]+", message = "Singer name can't include special characters, but except for comma")
    private String genre;
}
