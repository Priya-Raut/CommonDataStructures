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

    public void traverseInOrder() {
        if(this.leftChild != null){
            this.leftChild.traverseInOrder();
        }
        System.out.println(this);
        if(this.rightChild != null){
            this.rightChild.traverseInOrder();
        }
    }

    @Override
    public String toString() {
        return "data=" + data + ' ';
    }

}
