package week9;

public class Book {
    private String title;
    private String authors;
    private int numberOfPages;
    private String publishDate;
    private String publisher;

    public String getInfo(){
        return "Title " + title + "\n" +
                "Author " + authors + "\n" +
                "Page Numbers " + numberOfPages + "\n" +
                "Publish Date " + publishDate + "\n" +
                "Publisher " + publisher + "\n";

    }

    public Book(String title, String authors, int numberOfPages, String publishDate, String publisher) {
        this.title = title;
        this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.publishDate = publishDate;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthors() {
        return authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getPublisher() {
        return publisher;
    }
}
