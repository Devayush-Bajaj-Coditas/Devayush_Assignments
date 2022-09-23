package com.bean;

import javax.swing.*;

public class Book {
    private int bookId;
    private String bookName, authorName;
    private float price;

    //getter and setter and ToString


    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "book{" +
                "bookId=" + bookId +
                ", bookName=" + bookName +
                ", authorName=" + authorName +
                ", price=" + price +
                '}';
    }
}
