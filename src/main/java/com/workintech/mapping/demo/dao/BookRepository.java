package com.workintech.Library.Rest.Api.dao;

import com.workintech.mapping.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Integer> {
}