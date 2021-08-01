package rza.myLibrary.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "books")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","books"})
public class Book {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "book_name")
    private String bookName;
    @Column(name = "page")
    private int page;
    @Column(name = "author")
    private String author;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;


}
