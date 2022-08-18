package secao13Enumeracao.aula152Composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Scanner sc = new Scanner(System.in);
        Comment c1 = new Comment("have a nice trip!");
        Comment c2 = new Comment("wow that's awesome!");
        Comment c3= new Comment("good night");
        Comment c4 = new Comment("may the force be with you");

        Post p1 = new Post(sdf.parse("21/08/2018 13:05:44"),
                "Traveling to new Zealand",
                "i'm going to visit this wonderful contry!",
                12);
        p1.addComments(c1);
        p1.addComments(c2);
        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),
                "good nigth guys",
                "see you tomorrow",
                5);

        p2.addComments(c3);
        p2.addComments(c4);
        System.out.println(p1);

        System.out.println(p2);













        sc.close();
    }
}
