package com.spring.blog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.blog.model.Post;

@Repository
public interface BlogRepository extends MongoRepository<Post, String> {
}
