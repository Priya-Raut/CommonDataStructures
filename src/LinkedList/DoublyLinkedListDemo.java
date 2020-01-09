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
public class DoublyLinkedListDemo {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.setHead(new DNode(0));
        list.insertAtHead(10);
        list.insertAtHead(15);
        list.insertAtHead(18);
        list.insertAtHead(20);
        System.out.println(list);
    }
}
