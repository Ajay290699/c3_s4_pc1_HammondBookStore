package com.bookstore;

public class BookImpl {
    public static void main(String[] args) {
        Book book = new Book();
        Author author = new Author();
        book.setTitle("Java Beginer Guide");
        book.setiSBN(1234);
        book.setDescription("It is very usefull for beginers to learn java");
        book.setPrice(500);
        author.setAuthorName("Ajay Chavan");
        author.setPenName("Parker");
        book.setAuthor(author);

        book.display();
    }
}
