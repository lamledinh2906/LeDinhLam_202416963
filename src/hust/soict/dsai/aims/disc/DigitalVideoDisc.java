package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // --- MỤC 5: Classifier Member (static) ---
    private static int nbDigitalVideoDiscs = 0; 
    private int id;

    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this(title);
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(title, category, cost);
        this.director = director;
        this.length = length;
    }

    // Getter methods
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getDirector() { return director; }
    public int getLength() { return length; }
    public float getCost() { return cost; }
    public int getId() { return id; }
    
    // Setter for title (Dùng cho bài TestPassingParameter)
    public void setTitle(String title) { this.title = title; }
}