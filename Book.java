package com.klef.jfsd.exam.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "books")
@Data // Lombok annotation to reduce boilerplate
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    
    private String title;
    private String author;
    private String genre;
    private Double price;
    private int publishedYear;
}
