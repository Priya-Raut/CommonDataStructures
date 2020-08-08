package implementation.tree.binarytree;

/**
 *
 * @author Priya Raut
 */
public class BinaryTreeDemo {
    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.createTree(tree.getRoot());
        System.out.println("Root: " + root);
        int treeHeight = tree.getHeight(root);
        System.out.println("Height: " + treeHeight);
        System.out.print("Breadth First Traversal: ");
        tree.searchBreadthFirst(root);
    }
}
