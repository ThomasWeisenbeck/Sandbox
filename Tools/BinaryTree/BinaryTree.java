package BinaryTree;
import java.util.Stack;

public class BinaryTree {
  private Node root;

  BinaryTree(Node root){
    this.root = root;
  }

  public Node getRoot(){
    return root;
  }

  public Node insert(Node node) {
    return insert(this.getRoot(), node);
  }

  public Node insert(Node parent, Node node) {
    if(parent == null){
      return node;
    }
    else {
      if(node.getData() < parent.getData()) {
        parent.left = insert(parent.left, node);
      }
      else {
        parent.right = insert(parent.right, node);
      }
      return parent;
    }
  }

  public Node search(char data) {
    return this.search(this.getRoot(), data);
  }

  public Node search(Node location, char data) {
    if(location == null || location.getData() == data) {
      return location;
    }
    else {
      if(location.getData() > data) {
        return search(location.left, data);
      }
      else {
        return search(location.right, data);
      }
    }
  }

  public void depthTraverse() {
    Stack<Node> stack = new Stack<Node>();
    stack.push(this.getRoot());

    Node temp;

    while (stack.size() > 0) {
      System.out.println(stack.peek().getData());
      temp = stack.pop();

      if(temp.right != null) {
        stack.push(temp.right);
      }

      if(temp.left != null) {
        stack.push(temp.left);
      }
    }
  }
}
