package lab05.AimsProject.media;

import java.util.Comparator;

class MediaComparatorByTitle implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        return media1.getTitle().compareTo(media2.getTitle());
    }
}

class MediaComparatorByCost implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        return Double.compare(media1.getCost(), media2.getCost());
    }
}

public abstract class Media{
    // Attribute
    private int id;
    private String title;
    private String category;
    private float cost;
    public static final Comparator<Media> COMPARE_BY_TITLE =
            new MediaComparatorByTitle();
    public static final Comparator<Media> COMPARE_BY_COST    =
            new MediaComparatorByCost();

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

    @Override
    public boolean equals(Object o) {
        if (o instanceof Media media) {
            return title.equals(media.getTitle());
        }
        return false;
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
