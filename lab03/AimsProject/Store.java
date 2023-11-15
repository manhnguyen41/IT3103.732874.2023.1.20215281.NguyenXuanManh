package lab03.AimsProject;

import java.util.ArrayList;

public class Store {
    // Attribute
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    // Constructor
    public Store() {
    }

    // Method to add a dvd
    public void addDVD(DigitalVideoDisc disc) {
        // Add to store
        itemsInStore.add(disc);

        // Notify
        System.out.println("The disc has been added");
    }

    // Method to remove a dvd
    public void removeDVD(DigitalVideoDisc disc) {
        // Search for disc
        int indexOfRemoved = itemsInStore.indexOf(disc);

        // If not found
        if (indexOfRemoved == -1) {
            System.out.println("The disc is not found");
            return;
        }

        // Remove
        itemsInStore.remove(indexOfRemoved);

        // Notify
        System.out.println("The disc has been removed");
    }

    // Getter and Setter
    public ArrayList<DigitalVideoDisc> getItemsInStore() {
        return itemsInStore;
    }

    public void setItemsInStore(ArrayList<DigitalVideoDisc> itemsInStore) {
        this.itemsInStore = itemsInStore;
    }
}
