package doublyLinkedList;
// WIP doubly linked list

public class DoublyLinkedList {
  private Node head;
  private Node tail;

  public DoublyLinkedList(Node head, Node tail){
    this.head = head;
    this.tail = tail;
  }

  private class Node {
    String value;
    Node next;
    Node prev;

    public Node(String value) {
      this.value = value;
    }

    public String getWord() {
      return this.value;
    }
  }

  public Node dequeue() {
    Node oldTail = this.tail;
    this.tail = oldTail.prev;
    return oldTail;
  }

  public void insertAfter(Node origNode, Node newNode) {
    Node next = origNode.next;
    origNode.next = newNode;
    newNode.next = next;
    newNode.prev = origNode;
    next.prev = newNode;
  }

  public void remove(Node nodeToDelete) {
    if(nodeToDelete == this.head) {
      this.head = this.head.next;
    } else {
      Node checkThisNode = this.head;

      while(checkThisNode.next != nodeToDelete) {
        checkThisNode = checkThisNode.next;
      }

      checkThisNode.next = nodeToDelete.next;
    }

    if(nodeToDelete == this.tail) {
      this.tail = this.tail.prev;
    } else {
      Node checkThisNode = this.tail;

      while(checkThisNode.prev != nodeToDelete) {
        checkThisNode = checkThisNode.prev;
      }

      checkThisNode.prev = nodeToDelete.prev;
    }
  }
}
