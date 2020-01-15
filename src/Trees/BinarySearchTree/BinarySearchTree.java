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

    public TreeNode delete(int data) {
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
        tree.insert(25);
        tree.insert(20);
        tree.insert(30);
        tree.insert(22);
        tree.insert(19);
        tree.insert(35);
        System.out.println("In order traversal:");
        tree.traverseInOrder();
        System.out.println("Successfull Find: " + tree.find(35));
        System.out.println("Unsuccessfull Find: " + tree.find(0));
    }
}
