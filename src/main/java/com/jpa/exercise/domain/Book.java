package com.jpa.exercise.domain;

import com.jpa.exercise.domain.dto.Publisher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "book2")
public class Book {
    @Id
    private Long id;
    private String name;
//    private Long authorId;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    @OneToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;
}