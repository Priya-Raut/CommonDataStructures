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
        if (this.root != null) {
            //case 0: if node to be deleted is root
            if(this.root.getData() == data){
                this.root = null;
            }
            else{
                root.delete(data);
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
        tree.insert(25);
        tree.insert(20);
        tree.insert(19);
        tree.insert(18);
        tree.insert(21);
        tree.insert(22);
        tree.insert(50);
        tree.insert(45);
        tree.insert(55);
        tree.insert(51);

        System.out.println("In order traversal:");
        tree.traverseInOrder();
        System.out.println("Successfull Find: " + tree.find(35));
        System.out.println("Unsuccessfull Find: " + tree.find(0));
        System.out.println("Find largest: " + tree.findLarget());
        System.out.println("Find smallest: " + tree.findSmallest());
        tree.delete(22);
        tree.traverseInOrder();
    }
}
