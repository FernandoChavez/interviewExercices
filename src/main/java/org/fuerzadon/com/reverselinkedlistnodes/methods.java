package org.fuerzadon.com.reverselinkedlistnodes;

import java.util.Stack;

public class methods {

    public static Node reverseWithStack(Node head){
        if(head == null)
            return null;

        Stack<Node> stack = new Stack<>();
        Node current = head;

        while(current != null){
            stack.push(current);
            current=current.next;
        }

        Node newHead = stack.pop();
        current= newHead;

        while(!stack.isEmpty()){
            current.next = stack.pop();
            current = current.next;
        }

        current.next=null;           // último nodo apunta a null
        return newHead;
    }

    public static Node reverseLinkedList(Node head){
        Node prev = null;
        Node current = head;

        while(current != null){
            Node nextNode = current.next; // Guarda el siguiente nodo
            current.next = prev;          // Invierte el enlace
            prev = current;               // Avanza el puntero prev
            current = nextNode;
        }

        return prev;
    }

    public static void printList(Node head){
        Node current = head;
        while(current != null){
            System.out.println(current.data + " ->");
            current = current.next;
        }
    }

}
