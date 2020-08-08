/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation.linkedlist.doubly_ended_linkedlist;

import implementation.linkedlist.singly_linkedlist.LinkedList;
import implementation.linkedlist.singly_linkedlist.Node;

/**
 *
 * @author piya
 */
public class DoublyEndedLinkedList extends LinkedList {

    private Node tail;

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (getHead() == null) {
            setHead(newNode);
            this.tail = newNode;

        }
        if (this.tail != null) {
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
    }

}
