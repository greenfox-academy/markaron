package com.greenfoxacademy.com.reddit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private Long id;
  private int vote;
  private String massage;
  private String url;

  public Post() {
  }

  public Post(String massage, String url) {
    this.vote = 0;
    this.massage = massage;
    this.url = url;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public int getVote() {
    return vote;
  }

  public void setVote(int vote) {
    this.vote = vote;
  }

  public void increaseVote(){
    vote ++;
  }

  public void decreaseVote(){
    vote --;
  }

  public String getMassage() {
    return massage;
  }

  public void setMassage(String massage) {
    this.massage = massage;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
