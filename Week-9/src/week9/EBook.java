package week9;

public class EBook extends Book{
    private String fontSize;
    private int currentPage;


    public EBook(String title, String authors, int numberOfPages,
                 String publishDate, String publisher, String fontSize,int currentPage) {
        super(title, authors, numberOfPages, publishDate, publisher);

        this.fontSize = fontSize;
        this.currentPage = currentPage;
           }


    @Override
    public String getInfo() {
        return super.getInfo() + "\n" + "Font Size: " + fontSize + "\n" + "Current Page: " + "\n" + currentPage;
    }


    public String getFontSize() {
        return fontSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
