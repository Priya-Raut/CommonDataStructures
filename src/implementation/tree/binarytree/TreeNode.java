package implementation.tree.binarytree;


/**
 *
 * @author Priya Raut
 */
public class TreeNode{
    private final int val;
    private TreeNode leftChild;
    private TreeNode rightChild;
    
    public TreeNode(int val){
        this.val = val;
    }
    
    public int getVal(){
        return this.val;
    }
    
    public void setLeftChild(TreeNode leftChild){
        this.leftChild = leftChild;
    }
    
    public void setRightChild(TreeNode rightChild){
        this.rightChild = rightChild;
    }
    
    public TreeNode getLeftChild(){
        return this.leftChild;
    }
    
    public TreeNode getRightChild(){
        return this.rightChild;
    }

    @Override
    public String toString() {
        return val + " ";
    }
    
    
}
