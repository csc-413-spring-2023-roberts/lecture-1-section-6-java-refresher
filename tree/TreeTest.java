package tree;

public class TreeTest {
  public static void main(String[] args) {
    Tree<Character> tree = new Tree<>();

    System.out.println(tree);
    System.out.println("Tree contains c? " + (tree.search('c') ? "yes" : "no"));

    tree.insert('g');
    tree.insert('c');
    tree.insert('a');
    tree.insert('e');
    tree.insert('m');
    tree.insert('k');
    tree.insert('z');

    System.out.println(tree);
    System.out.println("Tree contains c? " + (tree.search('c') ? "yes" : "no"));
    System.out.println("Tree contains r? " + (tree.search('r') ? "yes" : "no"));

    System.out.println("PREORDER");
    tree.preorder();
    System.out.println("INORDER");
    tree.inorder();
    System.out.println("POSTORDER");
    tree.postorder();
  }
}
