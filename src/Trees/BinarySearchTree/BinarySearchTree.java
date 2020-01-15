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

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("***** Insert Operation *****");
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(10);
        tree.insert(17);
        tree.insert(8);
        tree.insert(30);
        tree.insert(32);
        tree.insert(31);
        tree.insert(33);

        System.out.println("****** In order traversal *****");
        tree.traverseInOrder();
        System.out.println("***** Find Operation **** ");
        System.out.println("Successfull Find: " + tree.find(35));
        System.out.println("Unsuccessfull Find: " + tree.find(0));
        System.out.println("Find largest: " + tree.findLarget());
        System.out.println("Find smallest: " + tree.findSmallest());
        tree.delete(30);
        tree.traverseInOrder();
    }
}
