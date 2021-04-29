package com.example.demoblogger.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Post {

    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "post_id")
    private List<Comment> comments;

    public Post(){}

    public Post(Long id, List<Comment> comments) {
        this.id = id;
        this.comments = comments;
    }

    //constructor
    //getter setter



}
