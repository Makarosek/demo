package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import javax.swing.text.DateFormatter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> posts;

    {
        posts = new ArrayList<>();
        Post first = new Post(1l, "Первый пост", new Date());
        posts.add(first);
    }

    public List<Post> listAllPosts(){
        return posts;
    }

    public void create(String text){
        posts.add(new Post((long)posts.size() + 1, text, new Date()));
    }
}
