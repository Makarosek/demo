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

    public List<Post> listAllPosts(){
        return Arrays.asList(new Post("Hello,", new Date() ),
                new Post("World", new Date()),
                new Post(",!", new Date()));
    }
}
