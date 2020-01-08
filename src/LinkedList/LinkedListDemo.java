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
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.insertAtHead(4);

        System.out.println(list);
    }
}
