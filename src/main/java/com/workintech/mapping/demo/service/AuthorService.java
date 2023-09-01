package com.workintech.Library.Rest.Api.service;

import com.workintech.Library.Rest.Api.entity.Author;
import com.workintech.Library.Rest.Api.entity.Category;

import java.util.List;

public interface AuthorService {

    List<Author> find();
    Author findById(int id);
    Author save(Author author);
    void delete(Author author);
}