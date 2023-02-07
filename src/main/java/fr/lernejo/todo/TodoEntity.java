package fr.lernejo.todo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("todo")
public class TodoEntity {
    @Id
    public Long id;
    public String message;
    public String author;


    public TodoEntity(String message, String author) {
        this.author= author;
        this.message= message;
    }
}
