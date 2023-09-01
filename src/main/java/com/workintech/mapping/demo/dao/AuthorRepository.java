package com.workintech.Library.Rest.Api.dao;

import com.workintech.Library.Rest.Api.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository <Author, Integer> {
}