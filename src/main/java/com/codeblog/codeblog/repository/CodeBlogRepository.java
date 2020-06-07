package com.codeblog.codeblog.repository;

import com.codeblog.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeBlogRepository extends JpaRepository<Post, Long> { // com a extensao JpaRepository ja temos os metodos do spring data como get, delete etc
}
