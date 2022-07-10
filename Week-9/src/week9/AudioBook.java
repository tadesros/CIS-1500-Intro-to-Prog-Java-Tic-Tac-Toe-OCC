package week9;

public class AudioBook extends Book{
    private String narrator;
    private String totalDuration;
    private String currentPositinTime;

    public AudioBook(String title, String authors, int numberOfPages, String publishDate, String publisher, String narrator, String totalDuration,String currentPositinTime) {
        super(title, authors, numberOfPages, publishDate, publisher);
        this.narrator = narrator;
        this.totalDuration = totalDuration;
        this.currentPositinTime = currentPositinTime;
    }


    @Override
    public String getInfo()
    {
        return super.getInfo() + "\n" +
                "Narrator " + narrator + "\n" +
                "Total Duration " + totalDuration + "\n" +
                "Current Position Time " + currentPositinTime + "\n";
    }


    public String getCurrentPositinTime() {
        return currentPositinTime;
    }

    public void setCurrentPositinTime(String currentPositinTime) {
        this.currentPositinTime = currentPositinTime;
    }

    public String getNarrator() {
        return narrator;
    }

    public String getTotalDuration() {
        return totalDuration;
    }
}


