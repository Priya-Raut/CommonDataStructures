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

    public void deleteFromStart() {
        this.head = this.head.getNextNode();
    }

    public int length() {
        int length = 0;
        Node current = this.head;
        while (current != null) {
            length++;
            current = current.getNextNode();
        }
        return length;
    }

    public Node findNode(int data) {
        Node current = this.head;
        while (current != null) {
            if (current.getData() == data) {
                return current;
            } else {
                current = current.getNextNode();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "LinkedList: ";
        Node current = this.head;
        while (current != null) {
            result += current + " ";
            current = current.getNextNode();
        }
        return result;
    }

}
