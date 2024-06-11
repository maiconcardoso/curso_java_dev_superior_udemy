package enumeracao.exercicios.exercicio02.program;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import enumeracao.exercicios.exercicio02.entities.Comment;
import enumeracao.exercicios.exercicio02.entities.Post;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        Post p1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", formatter), "Traveling to new Zealand",
                "I'm going to visit this wonderfull country!", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);


    }
}
