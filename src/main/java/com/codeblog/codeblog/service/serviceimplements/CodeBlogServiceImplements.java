package com.codeblog.codeblog.service.serviceimplements;

import com.codeblog.codeblog.model.Post;
import com.codeblog.codeblog.repository.CodeBlogRepository;
import com.codeblog.codeblog.service.CodeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CodeBlogServiceImplements implements CodeBlogService {

    @Autowired //para poder usar as instancias do repository
    CodeBlogRepository codeBlogRepository;

    @Override
    public List<Post> findAll() {
        return codeBlogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeBlogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeBlogRepository.save(post);
    }
}
