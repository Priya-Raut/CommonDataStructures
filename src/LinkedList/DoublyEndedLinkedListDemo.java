/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 * A class to demonstrate the functions from DoublyEndedLinkedList class. 
 *
 * @author piya
 */
public class DoublyEndedLinkedListDemo {

    public static void main(String[] args) {
        DoublyEndedLinkedList list = new DoublyEndedLinkedList();
        list.insertAtTail(3);
        list.insertAtTail(2);
        System.out.println(list);
    }
}
