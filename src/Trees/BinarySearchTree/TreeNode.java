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
    public TreeNode findSmallest() {
        TreeNode smallest = this;
        if (this.leftChild != null) {
            smallest = this.leftChild;
            return smallest.findSmallest();
        }
        return smallest;
    }

    /**
     * Delete the node with given data.
     *
     * @param newData the data present in the node to be deleted
     */
    public void delete(int newData) {
        TreeNode current = this;
        TreeNode parent = null;
        boolean isLeftNode = false;

        while (current.data != newData) {
            parent = current;
            if (current.leftChild != null && newData < current.data) {
                current = current.leftChild;
                isLeftNode = true;
            } else if (current.rightChild != null && newData > current.data) {
                current = current.rightChild;
                isLeftNode = false;
            }
        }
        if (current.data == newData) {
            System.out.println("Node to be deleted is found: " + current);
            // case 1: node to be deleted is leaf node
            if (current.leftChild == null && current.rightChild == null) {
                if (isLeftNode) {
                    System.out.println("Node to be deleted is leftChild of its parent");
                    parent.leftChild = null;
                } else {
                    System.out.println("Node to be deleted is rightChild of its parent");
                    parent.rightChild = null;
                }
            }
            // case 2: node to be deleted has one child (either left or right)
            // (leftChild != null && rightChild == null) | (leftChild == null && rightChild != null)
            
            // case 3: node to be deleted has two children
            // leftChild != null && rightChild != null

        } else {
            System.out.println("Node to be deleted does not exist");
        }


    }
    
    public boolean isLeafNode(TreeNode node){
        return node.leftChild == null && node.rightChild == null;
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
