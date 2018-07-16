package com.launchacademy.linkedlist;

public class LinkedList {
  @SuppressWarnings("unused")
  private Node head;

  LinkedList(Node head) {
    this.head = head;
  }

  public String toString() {
    String sentence = "";
    Node node = head;
    while(node != null) {
      sentence += node.getWord() + " ";
      node = node.next;
    }
    return sentence.trim();
  }

  public void appendNode(Node nodeToAppend) {
    Node tail = this.head;
    while(tail.next != null) {
      tail = tail.next;
    }

    tail.next = nodeToAppend;
  }

  public void insertAfter(Node prevNode, Node newNode) {
    Node oldNext = prevNode.next;
    prevNode.next = newNode;
    newNode.next = oldNext;
  }

  public Node deleteNode(Node nodeToDelete) {

     if(nodeToDelete == this.head) {
       this.head = this.head.next;
     } else {
       Node checkThisNode = this.head;

       while(checkThisNode.next != nodeToDelete) {
         checkThisNode = checkThisNode.next;
       }

       checkThisNode.next = nodeToDelete.next;
     }

    return nodeToDelete;
  }

  public void pushNode(Node nodeToPush) {
    Node oldHead = this.head;
    this.head = nodeToPush;
    nodeToPush.next = oldHead;
  }

  public int length() {
    Node currentNode = this.head;
    int count = 0;

    while(currentNode != null) {
      count ++;
      currentNode = currentNode.next;
    }

    return count;
  }

  //Extra credit:
  public void deleteWordsStartingWith(char letter) {
    //eliminate all words starting with the specified letter
  }

  public void makeUnique() {
    //eliminate all duplicate words in the list
  }
}
