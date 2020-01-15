/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees.BinarySearchTree;

/**
 *
 * @author piya
 */
public class BinarySearchTree {

    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

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

    public TreeNode find() {
        return null;
    }

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
        tree.traverseInOrder();
    }
}
