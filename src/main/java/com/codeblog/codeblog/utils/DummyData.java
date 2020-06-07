package com.codeblog.codeblog.utils;

import com.codeblog.codeblog.model.Post;
import com.codeblog.codeblog.repository.CodeBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    CodeBlogRepository codeBlogRepository;

   // @PostConstruct // tudo que eu colocar ao metodo a baixo vai ser executado conforme a aplicação vai subindo por isso depois de ter subido uma vez e ter criado oque eu quis eu comentei
    public void savePosts() {

        List<Post> postList = new ArrayList<>();
        //Tudo isso é apenas para simular um post real já que o banco de dados se encontra vazio
        Post post1 = new Post();
        post1.setAutor("Marcos Vinícius Santos Souza");
        post1.setData(LocalDate.now());
        post1.setTexto("Texto 1: Primeira aplicação de um blog usando Spring boot com mysql ea IDE intelliJ community edition");
        post1.setTitulo("Aplicação Spring");

        Post post2 = new Post();
        post2.setAutor("Marcos Vinícius Santos Souza");
        post2.setData(LocalDate.now());
        post2.setTexto("Texto2: Primeira aplicação de um blog usando Spring boot com mysql ea IDE intelliJ community edition");
        post2.setTitulo("SpringBoot");

        postList.add(post1);
        postList.add(post2);

        for (Post post : postList) {
            Post postSaved = codeBlogRepository.save(post);
            System.out.println(postSaved.getId());
        }

    }
}
