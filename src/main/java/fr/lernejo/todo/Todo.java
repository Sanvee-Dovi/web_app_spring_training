package fr.lernejo.todo;

public record Todo(String author , String message) {

    public Todo (String author , String message){
        this.author = author;
        this.message = message;
    }
}
