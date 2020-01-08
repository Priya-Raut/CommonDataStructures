/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author piya
 */
public class LinkedList {

    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
}

@Override
        public String toString() {
        String result = "LinkedList: ";
        Node current = this.head;
        System.out.println(current);
        while (current != null) {
            result += current + " ";
            current = current.getNextNode();
        }
        return result;
    }

}
