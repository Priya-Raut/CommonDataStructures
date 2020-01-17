/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees.BinarySearchTree;

/**
 * A class which represents binary search tree data structure
 *
 * @author piya
 */
public class BinarySearchTree {

    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    /**
     * Insert data in tree.
     *
     * @param data to be inserted in the tree
     */
    public void insert(int data) {
        //if no root, then new node becomes root
        if (this.root == null) {
            System.out.println("New node becomes root node");
            this.root = new TreeNode(data);
        } else {
            this.root.insert(data);
        }
    }

    /**
     * Delete the node with given data.
     *
     * @param data the data present in the node to be deleted
     */
    public void delete(int data) {
        if (root == null) {
            return;
        }
        TreeNode current = this.root;
        TreeNode parent = this.root;
        boolean isLeftNode = false;

        while (current != null && current.getData() != data) {
            System.out.println("current: " + current);
            parent = current;
            if (data < current.getData()) {
                current = current.getLeftChild();
                isLeftNode = true;
            } else {
                current = current.getRightChild();
                isLeftNode = false;
            }
        }
        if (current == null) {
            System.out.println("Node to be deleted does not exist");
            return;
        }
        if (current.getData() == data) {
            System.out.println("Node to be deleted is found: " + current);
            // case 1: node to be deleted is leaf node
            if (current.isLeafNode()) {
                if (current == root) {
                    this.root = null;
                } else if (isLeftNode) {
                    System.out.println("Node to be deleted is leftChild of its parent");
                    parent.setLeftChild(null);
                } else {
                    System.out.println("Node to be deleted is rightChild of its parent");
                    parent.setRightChild(null);
                }
            } // case 2: node to be deleted has one child (either left or right)
            else if (current.hasSingleLeftChild()) {
                System.out.println("Single Left Child Current: " + current + " Parent: " + parent);
                if (current == this.root) {
                    System.out.println("Current node is root");
                    this.root = current.getLeftChild();
                } else if (isLeftNode) {
                    System.out.println("Current node is parent's left child");
                    parent.setLeftChild(current.getLeftChild());
                } else {
                    System.out.println("Current node is parent's right child");
                    parent.setRightChild(current.getLeftChild());
                }
            } else if (current.hasSingleRightChild()) {
                System.out.println("Single Right Child Current: " + current + " Parent: " + parent);
                if (current == this.root) {
                    System.out.println("Current node is root");
                    this.root = current.getRightChild();
                } else if (isLeftNode) {
                    System.out.println("Current node is parent's left child");
                    parent.setLeftChild(current.getRightChild());
                } else {
                    System.out.println("Current node is parent's right child");
                    parent.setRightChild(current.getRightChild());
                }
            } // case 3: node to be deleted has two children
            else if (current.hasTwoChildren()) {
                System.out.println("Current: " + current + " Parent: " + parent);
                TreeNode successor = current.getRightChild();
                TreeNode successorParent = current.getRightChild();
                //find the successor node, left most node the target node's right subtree
                while (successor.getLeftChild() != null) {
                    successorParent = successor;
                    successor = successor.getLeftChild();
                }
                System.out.println("Successor: " + successor + "successorParent: " + successorParent);
                if (successor != current.getRightChild()) {
                    successorParent.setLeftChild(successor.getRightChild());
                    successor.setRightChild(successorParent);
                }
                if (current == this.root) {
                    this.root = successor;
                } else if (isLeftNode) {
                    parent.setLeftChild(successor);
                } else {
                    parent.setRightChild(successor);
                }
                successor.setLeftChild(current.getLeftChild());
            }
        }
    }

    /**
     * Find smallest node from tree.
     *
     * @return smallest node from the tree
     */
    public TreeNode findSmallest() {
        if (root != null) {
            return root.findSmallest();
        }
        return null;
    }

    /**
     * Find largest node from the tree.
     *
     * @return largest node from the tree
     */
    public TreeNode findLarget() {
        if (root != null) {
            return root.findLargest();
        }
        return null;
    }

    /**
     * Find given data in tree.
     *
     * @param newData data to be searched in tree
     * @return TreeNode if newData exists in tree, null otherwise
     */
    public TreeNode find(int newData) {
        if (root != null) {
            return root.find(newData);
        }
        return null;
    }

    /**
     * Traverse all the nodes of tree using in-order traversal (left, root,
     * right)
     */
    public void traverseInOrder() {
        if (this.root != null) {
            root.traverseInOrder();
        }
    }

    /**
     * Traverse all the nodes of tree using pre-order traversal (root, left
     * right)
     */
    public void traversePreOrder() {
        if (root != null) {
            root.traversePreOrder();
        }
    }

    /**
     * Traverse all the nodes of tree using post-order traversal (left right,
     * root)
     */
    public void traversePostOrder() {
        if (root != null) {
            root.traversePostOrder();
        }
    }

    /**
     * Returns height of the tree.
     *
     * @return height of the tree
     */
    public int height() {
        if (root != null) {
            return root.height();
        }
        return 0;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("***** Insert Operation *****");
        tree.insert(52);
        tree.insert(33);
        tree.insert(25);
        tree.insert(12);
        tree.insert(27);
        tree.insert(39);
        tree.insert(34);
        tree.insert(48);
        tree.insert(65);
        tree.insert(60);
        tree.insert(78);
        tree.insert(72);
        tree.insert(90);

        System.out.println("****** In order traversal *****");
        tree.traverseInOrder();
        System.out.println("\n****** Pre order traversal *****");
        tree.traversePreOrder();
        System.out.println("\n****** Post order traversal *****");
        tree.traversePostOrder();
        System.out.println("***** Find Operation **** ");
        System.out.println("Successfull Find: " + tree.find(35));
        System.out.println("Unsuccessfull Find: " + tree.find(0));
        System.out.println("Find largest: " + tree.findLarget());
        System.out.println("Find smallest: " + tree.findSmallest());
        System.out.println("Hight: " + tree.height());
        tree.delete(39);
        System.out.println("****** In order traversal *****");
        tree.traverseInOrder();
    }
}
