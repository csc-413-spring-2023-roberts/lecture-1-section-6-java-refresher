package tree;

public class Node<T extends Comparable<T>> {
  private T data;
  private Node<T> left, right;

  public Node(T dataValue) {
    this.data = dataValue;

    this.left = null;
    this.right = null;
  }

  public void insert(T insertValue) {
    if (insertValue.compareTo(this.data) < 0) {
      if (this.left == null) {
        this.left = new Node<T>(insertValue);
      } else {
        this.left.insert(insertValue);
      }
    } else {
      if (this.right == null) {
        this.right = new Node<T>(insertValue);
      } else {
        this.right.insert(insertValue);
      }
    }
  }

  public boolean search(T searchValue) {
    if (searchValue.equals(this.data)) {
      return true;
    } else if (searchValue.compareTo(this.data) < 0) {
      return this.left != null && this.left.search(searchValue);
    } else {
      return this.right != null && this.right.search(searchValue);
    }
  }

  public void preorder() {
    System.out.print(this.data + " ");

    if (this.left != null) {
      this.left.preorder();
    }

    if (this.right != null) {
      this.right.preorder();
    }
  }

  public void inorder() {
    if (this.left != null) {
      this.left.inorder();
    }

    System.out.print(this.data + " ");

    if (this.right != null) {
      this.right.inorder();
    }
  }

  public void postorder() {
    if (this.left != null) {
      this.left.postorder();
    }

    if (this.right != null) {
      this.right.postorder();
    }

    System.out.print(this.data + " ");
  }
}
