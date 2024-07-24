package set_map.book.linked_list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Cria uma lista encadeada
        LinkedList<Character> ll = new LinkedList<>();

        // Adiciona elementos à lista encadeada.
        ll.add('B');
        ll.add('E');
        ll.add('F');
        System.out.println("Original contents: " + ll);

        // Demostra addLast() e addFirst()
        ll.addLast('G');
        ll.addFirst('A');
        System.out.println("\nAfter calls to addFirst() and addLast()");
        System.out.println("Contents: " + ll);

        // Adiciona elementos em um índice.
        ll.add(2, 'D');
        ll.add(2, 'C');
        System.out.println("\nAfter insertions.");
        System.out.println("Contents: " + ll);

        // Exibe o primeiro e o último elementos.
        System.out.println("\nHere are the first and last elements: " + 
            ll.getFirst() + " " + ll.getLast());
        
        // Cria uma visão de sublista
        List<Character> sub = ll.subList(2, 5);
        System.out.println("\nContents of sublist: " + sub);

        // Cria uma nova lista contendo a sublista
        LinkedList<Character> ll2 = new LinkedList<>(sub);

        // Remove de ll os elementos de ll2
        ll.removeAll(ll2);

        System.out.println("\nAfter removing ll2 from ll.");
        System.out.println("Contents: " + ll);

        // Remove o primeiro e o último elementos.
        ll.removeFirst();
        ll.removeLast();

        System.out.println("After deleting first and last element: ");
        System.out.println("Contents: " + ll);

        // Obtém e define um valor usando um índice.
        ll.set(0, Character.toLowerCase(ll.get(0)));

        System.out.println("\nAfter change: " + ll);


    }
}
