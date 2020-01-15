/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees.BinarySearchTree;

/**
 * A class which represents node of a binary search tree.
 *
 * @author piya
 */
public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    /**
     * Insert data in tree.
     *
     * @param newData data to be inserted in the tree
     */
    public void insert(int newData) {
        // insert on left
        if (newData < this.data) {
            if (this.leftChild == null) {
                System.out.println("New node becomes left node");
                this.leftChild = new TreeNode(newData);
            } else {
                System.out.println("Left insert");
                this.leftChild.insert(newData);
            }
        } // insert on right
        else {
            if (this.rightChild == null) {
                System.out.println("New node becomes right node");
                this.rightChild = new TreeNode(newData);
            } else {

                System.out.println("Right insert");
                this.rightChild.insert(newData);
            }
        }
    }

    /**
     * Find given data in tree.
     *
     * @param newData data to be searched in tree
     * @return TreeNode if newData exists in tree, null otherwise
     */
    public TreeNode find(int newData) {
        if (newData == this.data) {
            System.out.println("Data found: " + this);
            return this;
        } else if (newData < this.data && this.leftChild != null) {
            System.out.println("find in left subtree");
            return this.leftChild.find(newData);
        } else if (newData > this.data && this.rightChild != null) {
            System.out.println("find in right subtree");
            return this.rightChild.find(newData);
        }
        return null;
    }
    
    /**
     * Find largest node from the tree.
     * 
     * @return largest node from the tree
     */
    public TreeNode findLargest() {
        TreeNode largest = this;
        if (this.rightChild != null) {
            largest = this.rightChild;
            return largest.findLargest();
        }
        return largest;
    }
    
    /**
     * 
     * @return 
     */
    public TreeNode findSmallest(){
        TreeNode smallest = this;
        if(this.leftChild != null){
           smallest = this.leftChild;
           return smallest.findSmallest();
        }
        return smallest;
    }
    /**
     * Traverse all the nodes of tree using in-order traversal (left, root,
     * right)
     */
    public void traverseInOrder() {
        if (this.leftChild != null) {
            this.leftChild.traverseInOrder();
        }
        System.out.println(this);
        if (this.rightChild != null) {
            this.rightChild.traverseInOrder();
        }
    }

    @Override
    public String toString() {
        return "data=" + data + ' ';
    }

}
