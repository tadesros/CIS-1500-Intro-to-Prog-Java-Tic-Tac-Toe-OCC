package week9;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("java programming","murach",777,"january 1st,2017","murach");
        System.out.println(book.getInfo());
        EBook ebook = new EBook("java programming","murach",
                777,"january 1st,2017","murach","12",343);
        System.out.println(ebook.getInfo());

        AudioBook audioBook = new AudioBook("java programming","murach",
                777,"january 1st,2017","murach","me","2 minutes","3 minutes");
        System.out.println(audioBook.getInfo());
    }

}