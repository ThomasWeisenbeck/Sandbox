package BinaryTree;

public class Main {

  public static void main(String[] args) {
    Node aNode = new Node('A');
    Node cNode = new Node('C');
    Node mNode = new Node('M');
    Node pNode = new Node('P');
    Node zNode = new Node('Z');
    BinaryTree tree = new BinaryTree(mNode);

    tree.insert(tree.getRoot(), aNode);
    tree.insert(tree.getRoot(), zNode);

    tree.insert(tree.getRoot(), cNode);
    tree.insert(tree.getRoot(), pNode);

    System.out.println("Root node: " + tree.getRoot().getData());
    System.out.println("Root's Left: " + tree.getRoot().left.getData());
    System.out.println("Root's Right: " + tree.getRoot().right.getData());

    System.out.println("Search for A: " + tree.search('A'));

    tree.depthTraverse();
    tree.breadthTraverse();
  }
}
