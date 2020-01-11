/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList.Implementation;

/**
 *
 * @author piya
 */
public class DNode {
    
    private int data;
    private DNode prevNode;
    private DNode nextNode;

    public DNode(int data) {
        this.data = data;
    }

    public DNode getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DNode prevNode) {
        this.prevNode = prevNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "data=" + data + ", ";
    }
    
}
