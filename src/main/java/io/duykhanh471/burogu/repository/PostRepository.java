package io.duykhanh471.burogu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.duykhanh471.burogu.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    // List<Post> findAll();
}