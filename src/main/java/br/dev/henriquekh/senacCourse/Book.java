package br.dev.henriquekh.senacCourse;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        setAuthor(author);
        setPages(pages);
        setTitle(title);
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    private void setPages(int pages) {
        if (pages < 1)
            throw new IllegalArgumentException("less then 1 page is not allowed");
        this.pages = pages;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public void displayInfo() {
        System.err.printf("%s - %s (%d paginas)\n", getTitle(), getAuthor(), getPages());
    }
}
