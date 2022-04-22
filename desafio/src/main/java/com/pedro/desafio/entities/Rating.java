package com.pedro.desafio.entities;

public class Rating {
    
    private Integer rate;
    private String comment;
    
    
    public Rating() {
    }
    
    public Rating(Integer rate, String comment) {
        this.rate = rate;
        this.comment = comment;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
}
