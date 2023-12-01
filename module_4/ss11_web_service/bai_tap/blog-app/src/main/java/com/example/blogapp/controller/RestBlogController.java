package com.example.blogapp.controller;

import com.example.blogapp.model.Blog;
import com.example.blogapp.model.Category;
import com.example.blogapp.service.IBlogService;
import com.example.blogapp.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class RestBlogController {
    @Autowired
    private ICategoryService categoryService;
    @Autowired
    private IBlogService blogService;

    @GetMapping("/category")
    public ResponseEntity<List<Category>> getList() {
        List<Category> categoryList = categoryService.getAllCategory();
        if (categoryList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @PostMapping("/category")
    public ResponseEntity<?> save(@RequestBody Category category) {
        if (category == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        categoryService.saveCategory(category);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/category/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        Category category1 = categoryService.getCategory(id);
        if (category1 == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        categoryService.deleteCategory(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping("/category/{id}")
    public ResponseEntity<?> update(@PathVariable int id,
                                    @RequestBody Category category) {
        Category category1 = categoryService.getCategory(id);
        if (category1 == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        categoryService.saveCategory(category);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/blog")
    public ResponseEntity<Page<Blog>> getPage(@RequestParam(defaultValue = "") String searchName,
                                              @RequestParam(defaultValue = "0") int page,
                                              @RequestParam(defaultValue = "0") int idCate) {
        Pageable pageable = PageRequest.of(page, 3);
        Page<Blog> blogPage;
        if (idCate == 0) {
            blogPage = blogService.displayAllBlog(searchName, pageable);
        } else {
            blogPage = blogService.searchByCategoryAndName(searchName, pageable, idCate);
        }
        if (blogPage.isEmpty()) {
            return new ResponseEntity<>(blogPage,HttpStatus.OK);
        }
        return new ResponseEntity<>(blogPage, HttpStatus.OK);
    }

    @GetMapping("/blog/detail/{id}")
    public ResponseEntity<Blog> getDetail(@PathVariable int id) {
        Blog blog = blogService.getBlog(id);
        if (blog == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
    @PatchMapping("/blog/{id}")
    public ResponseEntity<?> updateBlog(@PathVariable int id,
                                    @RequestBody Blog blog) {
        Blog blog1 = blogService.getBlog(id);
        if (blog1 == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        blogService.update(blog1);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
