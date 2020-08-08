/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation.tree.binary_search_tree;

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
                this.leftChild = new TreeNode(newData);
            } else {
                this.leftChild.insert(newData);
            }
        } // insert on right
        else {
            if (this.rightChild == null) {
                this.rightChild = new TreeNode(newData);
            } else {
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
            return this;
        } else if (newData < this.data && this.leftChild != null) {
            return this.leftChild.find(newData);
        } else if (newData > this.data && this.rightChild != null) {
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
     * Find smallest node from the tree.
     *
     * @return largest node from the tree
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
     * Check if node is a leaf node or not.
     *
     * @return true if node is a leaf node, false otherwise
     */
    public boolean isLeafNode() {
        return this.leftChild == null && this.rightChild == null;
    }

    /**
     * Check if node has single left child or not.
     *
     * @return true if node has single left child, false otherwise
     */
    public boolean hasSingleLeftChild() {
        return (this.leftChild != null && this.rightChild == null);
    }

    /**
     * Check if node has single right child or not.
     *
     * @return true if node has single right child, false otherwise
     */
    public boolean hasSingleRightChild() {
        return this.leftChild == null && this.rightChild != null;
    }

    /**
     * Check if node has two children or not.
     *
     * @return true if node has two children, false otherwise
     */
    public boolean hasTwoChildren() {
        return this.leftChild != null && this.rightChild != null;
    }

    /**
     * Traverse all the nodes of tree using in-order traversal (left, root,
     * right)
     */
    public void traverseInOrder() {
        if (this.leftChild != null) {
            this.leftChild.traverseInOrder();
        }
        System.out.print(this.data + " ");
        if (this.rightChild != null) {
            this.rightChild.traverseInOrder();
        }
    }

    /**
     * Traverse all the nodes of tree using pre-order traversal (root, left
     * right)
     */
    public void traversePreOrder() {
        System.out.print(this.data + " ");
        if (this.leftChild != null) {
            this.leftChild.traversePreOrder();
        }
        if (this.rightChild != null) {
            this.rightChild.traversePreOrder();
        }
    }

    /**
     * Traverse all the nodes of tree using post-order traversal (left right,
     * root)
     */
    public void traversePostOrder() {
        if (this.leftChild != null) {
            this.leftChild.traversePostOrder();
        }
        if (this.rightChild != null) {
            this.rightChild.traversePostOrder();
        }
        System.out.print(this.data + " ");
    }
    
    /**
     * Returns height of the tree.
     * 
     * @return height of the tree
     */
    public int height() {
        int left = 0 , right = 0;
        if (isLeafNode()) {
            return 1;
        }
        if (this.leftChild != null) {
            left = this.leftChild.height();
        }
        if (this.rightChild != null) {
            right = this.rightChild.height();
        }
        return (left > right)?(left + 1):(right + 1);
    }
    
    @Override
    public String toString() {
        return "data=" + data + ' ';
    }

}
