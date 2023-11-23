package com.example.blogapp.service;

import com.example.blogapp.model.Blog;
import com.example.blogapp.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogService {
    void createNewBlog(Blog blog);

    List<Blog> getAllBlog();

    void update(Blog blog);

    void delete(int id);

    Blog getBlog(int id);

    List<Blog> getBlogByIdCategory(int id);

    Page<Blog> search(String name, Pageable pageable);

    Page<Blog> displayAllBlog(String name, Pageable pageable);

    Page<Blog> searchByCategory(Pageable pageable, int idCate);

    Page<Blog> searchByCategoryAndName(String name, Pageable pageable, int idCate);
}
