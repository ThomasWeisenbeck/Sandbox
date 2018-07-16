package BinaryTree;
import java.util.Stack;
import java.util.LinkedList;
import java.util.ArrayList;

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

  public void breadthTraverse() {
    LinkedList<Node> list = new LinkedList<Node>();
    list.add(this.getRoot());

    Node temp;

    while (list.size() > 0) {
      System.out.println(list.peek().getData());
      temp = list.remove();

      if(temp.left != null) {
        list.add(temp.left);
      }

      if(temp.right != null) {
        list.add(temp.right);
      }
    }
  }

  public void mprint() {
    //pprint 2
    //we don't have to do any coding, we can just use MATH!
    //as long as we are pushing null to our array, we can calculate
    //  which level a node is on by using its index in the list and our knowledge
    //  of binary tree properties. list[0] is always root, list[7] is the
    //  first node on level 4, and so on.
    //Each level X has 2 to the power of X nodes, including null
    //Level X begins at index 2^X-1 + 2^X-2 ... until we hit 0.
    LinkedList<Node> list = new LinkedList<Node>();
    ArrayList<String> printList = new ArrayList<String>();

    Node temp;
    Node nullNode = new Node(' ');

    list.add(this.getRoot());
    while (list.size() > 0 && list.size() <= 15) {
      printList.add(Character.toString(list.peek().getData()));

      temp = list.remove();

      if (temp.left == null) {
        list.add(nullNode);
      } else {
        list.add(temp.left);
      }

      if (temp.right == null) {
        list.add(nullNode);
      } else {
        list.add(temp.right);
      }
    }

    System.out.println(printList);
    //WIP commit for 7/15 - working on getting this to print as one array
    //  before implementing the 2^X logic to split it up.
    //Current issue I am fiddling with is that the while loop will run
    //  indefinitely now that it handles nulls, as the bottom of any tree is
    //  just infinite null nodes.
    //We can't solve this by just stopping when we start hitting null nodes
    //  because in an unbalanced tree we might have a sequence of nulls that
    //  are still relevant to our data.
    //Seems I will need a .depth() method after all. My intention is to find
    //  depth by checking after every 2^X nodes that 2^X-1 most recent
    //  were not null. This will be interesting when it works.
  }

  public void pprint() {
    //calculate depth of longest branch
    //set up X linkedLists where x=depth or depth-1
    //output will be arraylist of arraylists of chars
    //not sure how to set up X lists with explicitly declared names such that they don't conflict
    //forEach list, we will iterate and add children to the subsequent list
    //we can add null or figure out a diff solution for blank spaces
    //alternatively we can work directly with our output arraylists
    //however, we want to figure out how to keep track of what level a node is on
  }
}
