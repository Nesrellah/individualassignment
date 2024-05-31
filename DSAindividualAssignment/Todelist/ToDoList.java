package com.nasri.DSA.DSAindividualAssignment.Todelist;

import java.util.ArrayList;
import java.util.Objects;

class Node{
    Task task;
    Node next;
    Node(Task task){ //create a node to store tasks
        this.task = task;
        next = null;
    }
}
public class ToDoList {
    Node head;
    ToDoList(){ // initialize the head to null
        this.head = null;
    }
    void addToDo(Task task){
        Node newNode = new Node(task); //creating a node that hold the task
        if (head == null){ // checks if the linked list is empty and assign the head
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){ //iterating until tha pointer becomes null
            current = current.next;
        }
        current.next = newNode;
    }
    void markToDoAsComplete(String title){
        Node current = head;
        while(current!= null){
            if(current.task.getTitle().equals(title)){ //finding the node where the title is found
                current.task.markCompleted();
            }
            current = current.next;
        }

    }

    void viewToDoList(){
        ArrayList<Node> tempList = new ArrayList<>(); // creating an array list to store the completed tasks
        Node current = head;
        while(current != null){ // loop to iterate through the linked list
           if(current.task.isCompleted())
               tempList.add(current); // add the completed tasks to the created array list
           else{ // print the undone tasks
               System.out.println("--------------------------------------------------------------------------------------------------");
               System.out.println("TITLE: " +current.task.getTitle());
               System.out.println("--------------------------------------------------------------------------------------------------");
               System.out.println("DESCRIPTION: "+current.task.getDescription());
               System.out.println("--------------------------------------------------------------------------------------------------");
               System.out.println("Task: NOT COMPLETED" );
               System.out.println("--------------------------------------------------------------------------------------------------");
               System.out.println();
           }
            current = current.next;
        }
        for (Node node : tempList){ //printing the completed tasks after the un doned task are printed
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println("TITLE: " +node.task.getTitle());
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println("DESCRIPTION: "+node.task.getDescription());
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println("Task:  COMPLETED" );
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ToDoList todo = new ToDoList();
        todo.addToDo(new Task("task1","description1"));
        todo.addToDo(new Task("task2","description2"));
        todo.markToDoAsComplete("task2");
        todo.addToDo(new Task("task3","description3"));
        todo.markToDoAsComplete("task3");
        todo.addToDo(new Task("task4","description4"));
        todo.markToDoAsComplete("task4");
        todo.viewToDoList();
    }
}
