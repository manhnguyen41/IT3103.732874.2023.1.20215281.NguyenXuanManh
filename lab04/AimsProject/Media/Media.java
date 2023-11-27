package lab04.AimsProject.Media;

public abstract class Media {
    // Attribute
    private int id;
    private String title;
    private String category;
    private float cost;

    // Constructor
    public Media(int id, String title) {
        this.id = id;
        this.title = title;
    }
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Method to print a media
    public void print() {
    }

    // Method to finds out if the corresponding disk is a match given the title.
    public boolean isMatch(String title) {
        return title.equals(this.title);
    }

    // Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
