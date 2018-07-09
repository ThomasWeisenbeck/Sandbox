package BinaryTree;

public class Node {
  private char data;
  Node left;
  Node right;

  Node(char data) {
    this.data = data;
    this.left = this.right = null;
  }

  public char getData() {
    return data;
  }
}
