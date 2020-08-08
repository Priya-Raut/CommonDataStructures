package implementation.tree.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author Priya Raut
 */
public class BinaryTree {

    private TreeNode root;

    public TreeNode getRoot() {
        return this.root;
    }

    public void searchBreadthFirst(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
          
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            System.out.print(node);
            if (node.getLeftChild() != null) {
                queue.add(node.getLeftChild());
            }
            if (node.getRightChild() != null) {
                queue.add(node.getRightChild());
            }
        }
    }

    public void searchDeapthFirst(TreeNode root) {

    }

    public void traverseInOrder(TreeNode root) {

    }

    public void traversePreOrder(TreeNode root) {

    }

    public void traversePostOrder(TreeNode root) {

    }

    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftSubtreeHeight = getHeight(root.getLeftChild());
        int rightSubtreeHeight = getHeight(root.getRightChild());
        return Math.max(leftSubtreeHeight, rightSubtreeHeight) + 1;
    }

    public TreeNode createTree(TreeNode root) {
        root = new TreeNode(1);
        root.setLeftChild(new TreeNode(2));
        root.setRightChild(new TreeNode(3));
        root.getLeftChild().setLeftChild(new TreeNode(4));
        root.getLeftChild().setRightChild(new TreeNode(5));
        return root;
        /* Tree looks like this:
                        1 
                    /       \ 
                  2          3 
                /   \       /  \ 
              4       5   null  null 
            /   \   /   \ 
         null null null null 
        
         */
    }
}
