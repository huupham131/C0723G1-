package com.example.blogapp.service;

import com.example.blogapp.model.Blog;

import java.util.List;

public interface IBlogService {
    void createNewBlog(Blog blog);
    List<Blog> getAllBlog();
    void update(Blog blog);
    void delete(int id);
    Blog getBlog(int id);
}
