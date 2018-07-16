package BinaryTree;

public class Main {

  public static void main(String[] args) {
    Node aNode = new Node('A');
    Node cNode = new Node('C');
    Node dNode = new Node('D');
    Node gNode = new Node('G');
    Node mNode = new Node('M');
    Node oNode = new Node('O');
    Node qNode = new Node('Q');
    Node tNode = new Node('T');
    Node pNode = new Node('P');
    BinaryTree tree = new BinaryTree(oNode);

    tree.insert(tree.getRoot(), tNode);
    tree.insert(tree.getRoot(), qNode);
    tree.insert(tree.getRoot(), gNode);
    tree.insert(tree.getRoot(), cNode);
    tree.insert(tree.getRoot(), pNode);
    tree.insert(tree.getRoot(), mNode);
    tree.insert(tree.getRoot(), aNode);
    tree.insert(tree.getRoot(), dNode);


//    System.out.println("Root node: " + tree.getRoot().getData());
//    System.out.println("Root's Left: " + tree.getRoot().left.getData());
//    System.out.println("Root's Right: " + tree.getRoot().right.getData());
//
//    System.out.println("Search for A: " + tree.search('A'));
//
//    tree.depthTraverse();
//    tree.breadthTraverse();
    tree.mprint();
  }
}
