package com.example.dictionary.service;

import com.example.dictionary.repository.IDictionaryRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DictionaryService implements IDictionaryService{
    private final IDictionaryRepository dictionaryRepository;

    public DictionaryService(IDictionaryRepository dictionaryRepository) {
        this.dictionaryRepository = dictionaryRepository;
    }


    @Override
    public Map<String, String> getAll() {
        return dictionaryRepository.getAll();
    }
}
