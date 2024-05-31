package com.nasri.DSA.DSAindividualAssignment.linkedlistandstack;

public class StackUsingLinkedList {
    LinkedList list;
    int top;
    int size;

    StackUsingLinkedList(){
        list = new LinkedList();
        top = 0;
        size = 0;
    }
    void push(int data){
        list.append(data);
        top ++;
    }
    void peek(){
        Node current = list.head;
        if (top <1){
            System.out.println("The stack is empty");
            return;
        }
        for(int i = 0; i < top- 1;i++){
            current = current.next;
        }
        System.out.println(current.value);
    }

    void pop(){
        if (top >= 1){
            peek();
            list.deletAtPosition(top);
            top--;
        }else System.out.println("The stack is empty");

    }
    boolean isEmpty(){
        return top == 0;
    }
    void size(){
        System.out.println(top);
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.size();
        stack.list.display();
        stack.pop();
        stack.list.display();
        stack.pop();
        stack.list.display();
        stack.pop();
        stack.pop();
        stack.peek();
    }
}
