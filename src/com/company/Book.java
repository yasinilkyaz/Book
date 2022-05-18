package com.company;

public class Book implements Comparable<Book>{
    private String bookName;
    private String authorName;
    private String space;
    private int pageNumber;
    private int releaseDate;

    public Book(String bookName, String authorName, String space, int pageNumber, int releaseDate) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.space = space;
        this.pageNumber = pageNumber;
        this.releaseDate = releaseDate;
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

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book book) {
        return (this.getBookName().compareTo(book.getBookName()));
    }
}
