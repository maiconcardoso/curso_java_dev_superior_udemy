package set_map.book.tree_set;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Character[] list = {'B', 'V', 'G' , 'L', 'A', 'Z', 'J', 'L'};

        System.out.print("Changing list:    " );
        for (Character ch : list) {
            System.out.print(ch + ", ");
        }
        System.out.println();

        // Criando um HashSet e TreeSet
        HashSet<Character> hs = new HashSet<>();
        TreeSet<Character> ts = new TreeSet<>();

        // Inserindo valores de list em um HashSet
        for (Character ch : list) {
            hs.add(ch);
        }

        // Inserindo valores de list em um TreeSet
        for (Character ch : list) {
            ts.add(ch);
        }

        System.out.println("Changing HashSet: " + hs);
        System.out.println("Changing TreeSet: " + ts);


    }

}
