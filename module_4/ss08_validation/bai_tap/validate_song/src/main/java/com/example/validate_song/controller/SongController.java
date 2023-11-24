package com.example.validate_song.controller;

import com.example.validate_song.model.Song;
import com.example.validate_song.model.SongDto;
import com.example.validate_song.service.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class SongController {
    @Autowired
    private ISongService songService;

    @GetMapping
    public ModelAndView showList() {
        List<Song> songList = songService.showList();
        return new ModelAndView("list", "songList", songList);
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        return new ModelAndView("create", "songDTO", new SongDto());
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute SongDto songDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            return "create";
        } else {
            Song song = new Song();
            BeanUtils.copyProperties(songDTO, song);
            songService.save(song);
            redirectAttributes.addFlashAttribute("mess", "add song successfully");
            return "redirect:/";
        }
    }

    @GetMapping("/update/{id}")
    public ModelAndView showUpdateForm(@PathVariable Integer id) {
        Optional<Song> song = songService.findById(id);
        SongDto songDTO = new SongDto();
        BeanUtils.copyProperties(song.get(), songDTO);
        return new ModelAndView("update", "songDTO", songDTO);
    }

    @PostMapping("/update/{id}")
    public String update(@Validated @ModelAttribute SongDto songDTO, BindingResult bindingResult, @PathVariable Integer id) {
        if (bindingResult.hasFieldErrors()) {
            return "update";
        } else {
            Optional<Song> song = songService.findById(id);
            BeanUtils.copyProperties(songDTO, song.get());
            songService.save(song.get());
            return "redirect:/";
        }
    }
}
