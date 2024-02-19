package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import javax.swing.text.DateFormatter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> posts;

    public List<Post> listAllPosts(){
        return posts;
    }

    public void create(String text){
        posts.add(new Post(text, new Date()));
    }
}
