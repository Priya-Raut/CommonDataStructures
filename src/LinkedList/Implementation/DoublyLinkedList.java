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
public class DoublyLinkedList {

    private DNode head;

    public DNode getHead() {
        return head;
    }

    public void setHead(DNode head) {
        this.head = head;
    }

    public void insertAtHead(int data) {
        DNode newNode = new DNode(data);
        if (this.head != null) {
            newNode.setNextNode(this.head);
            this.head.setPrevNode(newNode);
            this.head = newNode;
        }
    }

    @Override
    public String toString() {
        String result = "LinkedList: ";
        DNode current = this.head;
        while (current != null) {
            result += current;
            current = current.getNextNode();
        }
        return result;
    }
}
