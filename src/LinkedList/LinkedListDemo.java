/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 * A class to demonstrate the functions from LinkedList class. 
 * 
 * @author piya
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtHead(20);
        list.insertAtHead(15);
        list.insertAtHead(10);
        list.insertAtHead(5);
        System.out.println(list);

        list.deleteFromStart();
        System.out.println(list);

        list.insertInBetweenSortedList(25);
        System.out.println(list);

        System.out.println("Found: " + list.findNode(4));
        System.out.println("Length: " + list.length());
    }
}
