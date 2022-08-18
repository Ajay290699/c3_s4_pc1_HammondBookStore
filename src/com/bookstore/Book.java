package com.bookstore;

public class Book {
    private int iSBN;
    private String title;
    private String description;
    private double price;

    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getiSBN() {
        return iSBN;
    }

    public void setiSBN(int iSBN) {
        this.iSBN = iSBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("title = " + title);
        System.out.println("iSBN = " + iSBN);
        System.out.println("description = " + description);
        System.out.println("price = " + price);
        System.out.println("author = " + author);
    }

}
