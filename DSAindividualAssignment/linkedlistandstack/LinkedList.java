package com.nasri.DSA.DSAindividualAssignment.linkedlistandstack;

class Node{
    int value;
    Node next;
    Node(int value){
        this.value = value;
        next = null;
    }
}
public class LinkedList {
    Node head;
    LinkedList(){
        this.head = null;
    }
    void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    //    defining a method to insert a node at a given position
    void insertAtPos(int data,int position){
        // Let's assume position start from 1 position of the first node is 1
        Node newNode = new Node(data);//create a node that have value of the data inserted
        if (position < 1){ // Check if the position inserted is valid (is natural number)
            System.out.println("Position must start from 1");
            return;
        }
        if (position == 1){ // we check if we are asked to make the node the head in which the head is found in the first position
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head; // we use it to traverse through the linked list
        int counter = 1; // we will use it to get the needed node position
        while(counter < position - 1){ //iterate until it get position - 1 (to get the pointer of the last node)
            current = current.next;
            counter++;
        }
        if (current == null){ //check for null pointer
            System.out.println("Null pointer");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;

    }
    void deletAtPosition(int position){
        Node current = head; // used to traverse through the linked list
        int counter = 1;
        if (position < 1){ // Check if the position inserted is valid (is natural number)
            System.out.println("Position must start from 1");
            return;
        }

        if(position == 1){
            head = head.next;
            return;
        }
        if (head == null){ // check if the list is empty
            System.out.println("Empty list");
            return;
        }
        while (counter < position -1){ // used to get the pointer of the node found before the position
            current = current.next;
            counter++;
        }
        if (current == null){ // check for null pointer
            System.out.println("null pointer");
            return;
        }
        current.next = current.next.next;
    }
    void deleteAfterNode(int data){
        Node current = head;
        if(head == null){ //check if the list is empty
            System.out.println("The list is empty");
            return;
        }
        while(current.value != data){ // find the node that the data is stored
            current = current.next;
        }
        if (current.next == null){
            System.out.println("null pointer");
            return;
        }
        current.next = current.next.next;
    }
    // defining the searching method
    void searchNode(int data){
        Node current = head;
        while(current!= null){
            if(current.value == data){
                System.out.printf("Search found: %d\n",data );
                return;
            }
            current = current.next;
        }
        System.out.println("Not found");
    }

    void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.value);
            if(current.next != null) System.out.print(" --> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.append(2);
        ls.append(4);
        ls.append(5);
        ls.append(6);
        ls.display();
        ls.insertAtPos(1,1);
        ls.insertAtPos(3,3);
        ls.insertAtPos(7,7);
        ls.display();

        ls.deleteAfterNode(7);
        ls.display();
        ls.searchNode(8);


    }
}
