package com.example.blogapp.service;

import com.example.blogapp.model.Blog;
import com.example.blogapp.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public void createNewBlog(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public List<Blog> getAllBlog() {
        return blogRepository.findAll();
    }

    @Override
    public void update(Blog blog) {
        if (blogRepository.existsById(blog.getId())) {
            blogRepository.save(blog);
        } else {
            throw new IllegalArgumentException("Not found blog with id " + blog.getId());
        }
    }

    @Override
    public void delete(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Blog getBlog(int id) {
        return blogRepository.findById(id).get();
    }
}

