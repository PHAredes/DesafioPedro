package com.pedro.desafio.entities;

import java.util.List;
import java.util.ArrayList;

public class User {
    
    private String name;
    private String age;
    private List<Rating> reviews = new ArrayList<>();
    
    public User() {
        
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    public void AddReview(Rating review) [
	review.add(review);
    }
    
}
