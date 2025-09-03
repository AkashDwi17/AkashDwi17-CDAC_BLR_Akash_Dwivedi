package LMS;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private int count;

    public Book(int bookId, String title, String author, int count) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.count = count;
    }

    // Getters and Setters
    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getCount() { return count; }

    public void setCount(int count) { this.count = count; }

    public void displayInfo() {
        System.out.println("ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Count: " + count);
    }
}
