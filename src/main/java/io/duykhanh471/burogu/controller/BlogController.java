package io.duykhanh471.burogu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.duykhanh471.burogu.dto.request.PostRequestDto;
import io.duykhanh471.burogu.mapper.PostMapper;
import io.duykhanh471.burogu.repository.PostRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/posts")
public class BlogController {
    @Autowired
    private PostMapper postMapper;

    private PostRepository postRepository;

    public BlogController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping
    public ResponseEntity<List<PostRequestDto>> getAllPosts(@RequestParam String param) {
        List<PostRequestDto> listPosts = postRepository.findAll().stream()
            .map(post -> postMapper.postToPostRequestDto(post)).toList();
        return new ResponseEntity<>(listPosts, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public String getPost(@RequestParam String param) {
        return new String();
    }
    
    
}
