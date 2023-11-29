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
        if (itemsInStore.contains(media)) {
            System.out.println("Media is already in the list");
            return;
        }
        itemsInStore.add(media);
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

    // Method to print all item in store
    public void printStore() {
        System.out.println("***********************STORE**********************");
        System.out.println("Items in store:");
        for (Media media : itemsInStore) {
            media.print();
        }
        System.out.println("**************************************************");
    }

    // Method to search for media in the store by title.
    public Media searchByTitle(String title) {
        for (Media media: itemsInStore) {
            if (media.isMatch(title)) {
                return media;
            }
        }
        System.out.println("Not found!");
        return null;
    }

    // Getter and Setter
    public List<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void setItemsInStore(List<Media> itemsInStore) {
        this.itemsInStore = itemsInStore;
    }
}
