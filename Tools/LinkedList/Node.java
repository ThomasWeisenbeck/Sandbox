package com.launchacademy.linkedlist;

public class Node {
  private String word;
  Node next;

  Node(String word){
    this.word = word;
    this.next = null;
  }

  public String getWord() {
    return this.word;
  }
}
