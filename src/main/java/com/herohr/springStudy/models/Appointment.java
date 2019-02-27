package com.herohr.springStudy.models;

import java.util.Date;

public class Appointment {
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    // Pojo
    private long bookId;
    private long studentId;
    private Date appointTime;

    private Book book;
}
