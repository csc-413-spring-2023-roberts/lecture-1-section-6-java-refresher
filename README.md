### February 1, 2023 - Section 6 - Binary Search Tree (BST)

#### Abstract Data Type (ADT) BST

Properties

- Parent node which can have at most two children (subtrees)
- Values in the left subtree are less than the parent value
- Values in the right subtree are greater than (or equal to) the parent value

Operations

- Search (find values)
- Insert (add values)
- ~~Remove~~
- Traversal
  - [pre]order
  - [in]order
  - [post]order

#### Implementation Plan

- Node
  - Fields (members): data, left, right
  - Operations (methods): insert, search, preorder, inorder, postorder
- Tree
  - Fields (members): root
  - Operations (methods): insert, search, preorder, inorder, postorder
- Test
  - Driver (main method)
  - Unit tests
