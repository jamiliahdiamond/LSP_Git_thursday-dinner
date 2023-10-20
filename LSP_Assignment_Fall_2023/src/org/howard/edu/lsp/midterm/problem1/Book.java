package org.howard.edu.lsp.midterm.problem1;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }

  
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Book)) {
            return false;
        }
        Book other = (Book) obj;
        return title.equals(other.title) && author.equals(other.author);
    }
}

