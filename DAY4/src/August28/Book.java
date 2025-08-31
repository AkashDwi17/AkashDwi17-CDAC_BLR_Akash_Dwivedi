package August28;

class Book {   // no need to make it public if used only inside package
    int bookId;
    String title;
    String author;
    int noOfBooks;
    boolean isIssued;

    public Book(int bookId, String title, String author, int noOfBooks, boolean isIssued) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.noOfBooks = noOfBooks;
        this.isIssued = isIssued;
    }

    @Override
    public String toString() {
        return "ID: " + bookId + ", Title: " + title + ", Author: " + author +
               ", Copies: " + noOfBooks + ", Issued: " + isIssued;
    }
}
