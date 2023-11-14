package com.example.dictionary.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionaryRepository implements IDictionaryRepository{
    private static Map<String,String> dictionary = new HashMap<>();
    static {
        dictionary.put("hello","xin chào");
        dictionary.put("good bye","tạm biệt");
        dictionary.put("morning","buổi sáng");
    }
    @Override
    public Map<String, String> getAll() {
        return dictionary;
    }
}
