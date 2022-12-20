package hr.tsd.books.model;

//import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Book {
    @Id
    @GeneratedValue
    private int id;
    private String writer;
    private String title;
    private double price;
    //konstruktor bez id, jer će se u bazu automatski generirati
    public Book(String writer, String title, double price) {
        this.writer = writer;
        this.title = title;
        this.price = price;
    }
}
