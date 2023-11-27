package lab04.AimsProject;

import lab04.AimsProject.Media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {
    // Attribute
    private List<Media> itemsInStore = new ArrayList<Media>();

    // Constructor
    public Store() {
    }

    // Method to add a media
    public void addMedia(Media media) {
        // Add to store
        itemsInStore.add(media);

        // Notify
        System.out.println("Added");
    }

    // Method to remove a media
    public void removeMedia(Media media) {
        // Search for disc
        int indexOfRemoved = itemsInStore.indexOf(media);

        // If not found
        if (indexOfRemoved == -1) {
            System.out.println("Not found");
            return;
        }

        // Remove
        itemsInStore.remove(indexOfRemoved);

        // Notify
        System.out.println("Removed");
    }

    // Getter and Setter
    public List<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void setItemsInStore(List<Media> itemsInStore) {
        this.itemsInStore = itemsInStore;
    }
}
