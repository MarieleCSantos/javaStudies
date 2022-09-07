package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[]args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post post1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);

        Comment comment1Post1 = new Comment("Have a nice trip");
        post1.addComment(comment1Post1);
        Comment comment2Post1 = new Comment("Wow that's awesome!");
        post1.addComment(comment2Post1);

        Post post2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);

        Comment comment1Post2 = new Comment("Good night");
        post2.addComment(comment1Post2);
        Comment comment2Post2 = new Comment("May the force be with you");
        post2.addComment(comment2Post2);

        System.out.println(post1);
        System.out.println(post2);


    }

}
