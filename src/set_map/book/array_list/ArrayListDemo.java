package set_map.book.array_list;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        // Cria uma lista de array.
        ArrayList<Character> al = new ArrayList<>();
        System.out.println("Initial size: " + al.size());

        // Adiciona elementos ao fim do lista, um de cada vez.
        al.add('A');
        al.add('B');
        al.add('C');
        al.add('D');
        al.add('E');

        System.out.println("\nSize after additions: " + al.size());

        // Exibe a lista de array usando a representação de toString().
        System.out.println("Contents: " + al);

        // Agora, adiciona elementos ao meio da lista.
        // Isso fará o array se expandir.
        for (int i=0; i<3; i++) {
            al.add(2, (char) ('X' + i));
        }
        System.out.println("\nSize after additions: " + al.size());
        System.out.println("Contents: " + al);

        // Exclui os elementos recém-adicionados.
        // Isso fará o array se contrair.
        for (int i=0; i<3; i++){
            al.remove(2);
        }

        System.out.println("\nSize after deletions: " + al.size());
        System.out.println("Contents: " + al);

        // Usa set() para definir o valor de um índice.
        for (int i=0; i<al.size(); i++) {
            al.set(i, Character.toLowerCase(al.get(i)));
        }

        System.out.println("\nAfter changing to lowercase.");
        System.out.println("Contents: " + al);

        // Encontra e remove um valor.
        int idx = al.indexOf('D');
        if (idx >=0) 
            al.remove(idx);
        System.out.println("\nAfter finding and removing d.");
        System.out.println("Contents: " + al);

        // Esvazia a lista.
        al.clear();
        System.out.println("\nAfter clearing the list.");
        System.out.println("Contents: " + al);

        // Adiciona os dígitos de 0 a 9
        for (int i=0; i<10; i++) {
            al.add((char) ('0' + i));
        }

        // Exibe elementos alternados.
        System.out.print("\nHere is ievery other digit: ");
        for (int i=0; i<al.size(); i+=2) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
    }   
}
