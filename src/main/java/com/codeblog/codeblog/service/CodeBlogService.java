package com.codeblog.codeblog.service;

import com.codeblog.codeblog.model.Post;

import java.util.List;

public interface CodeBlogService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);

}
