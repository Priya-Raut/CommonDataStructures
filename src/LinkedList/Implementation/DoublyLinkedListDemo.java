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
public class DoublyLinkedListDemo {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.setHead(new DNode(2));
        list.insertAtHead(4);
        list.insertAtHead(5);
        list.insertAtHead(3);
        System.out.println(list);
    }
}
