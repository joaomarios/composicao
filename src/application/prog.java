package application;

import entidade.comentarios;
import entidade.post;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class prog {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        comentarios c1 = new comentarios("have a nice trip!");
        comentarios c2 = new comentarios("wow that s awesone!");
        post p1 = new post(
                sdf.parse("21/06/2018 13:05:44"),
                "traveling to new zealeand",
                " i m goig to visit this wondeful country",
                12);
        p1.addCometarios(c1);
        p1.addCometarios(c2);
        System.out.println(p1);
        
         comentarios c3 = new comentarios("good nigth!");
        comentarios c4 = new comentarios("may the force!");
        post p2 = new post(
                sdf.parse("28/06/2018 23:05:44"),
                "good nigth guys",
                "see you tomorrow",
                12);
        p2.addCometarios(c3);
        p2.addCometarios(c4);
        System.out.println(p2);

    }

}
