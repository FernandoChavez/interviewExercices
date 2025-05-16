package org.fuerzadon.com.reverselinkedlistnodes;

public class main {
    public static void main(String[] args) {
        // Crear la lista: 1 -> 2 -> 3 -> 4 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Lista original: ");
        methods.printList(head);

        //Invertir usando stack
        head = methods.reverseWithStack(head);

        //Invertir sin stack
        //head = methods.reverseLinkedList(head);

        System.out.println("Lista Invertida: ");
        methods.printList(head);
    }
}
