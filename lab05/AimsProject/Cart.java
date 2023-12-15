package lab05.AimsProject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lab05.AimsProject.media.DigitalVideoDisc;
import lab05.AimsProject.media.Media;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    // Attribute
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    private int numOfDVDs;

    // Constructor
    public Cart() {
        numOfDVDs = 0;
    }

    // Method to add a new media
    public void addMedia(Media media) throws Exception {
        if (itemsOrdered.contains(media)) {
            throw new Exception("Media is already in the list");
        }
        itemsOrdered.add(media);
        if (media.getClass() == DigitalVideoDisc.class) {
            numOfDVDs++;
        }
        System.out.println("Added to cart successful");
    }

    // Method to remove a media
    public void removeMedia(Media media) throws Exception {
        // Search for media
        int indexOfRemoved = itemsOrdered.indexOf(media);

        // If not found
        if (indexOfRemoved == -1) {
            throw new Exception("Not found");
        }

        // Remove
        itemsOrdered.remove(indexOfRemoved);
        if (media.getClass() == DigitalVideoDisc.class) {
            numOfDVDs--;
        }

        // Notify
        System.out.println("Removed");
    }

    // Method to calculate the total cost
    public double totalCost() {
        float cost = 0;
        for (Media media: itemsOrdered) {
            cost += media.getCost();
        }

        return Math.round(cost * 100.0) / 100.0;
    }

    // Method to print the list of ordered items of a cart,
    // the price of each item, and the total price
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (Media media : itemsOrdered) {
            media.print();
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("**************************************************");
    }

    // Method to search for media in the cart by ID and display the search results.
    public Media searchByID(int id) throws Exception {
        for (Media media: itemsOrdered) {
            if (media.getId() == id) {
                return media;
            }
        }
        throw new Exception("Not found!");
    }

    // Method to search for media in the cart by title.
    public Media searchByTitle(String title) throws Exception {
        for (Media media: itemsOrdered) {
            if (media.isMatch(title)) {
                return media;
            }
        }
        throw new Exception("Not found!");
    }

    // Method to sort by title and print
    public void sortByTitle() {
        itemsOrdered.sort(Media.COMPARE_BY_TITLE);
        printCart();
    }

    // Method to sort by cost and print
    public void sortByCost() {
        itemsOrdered.sort(Media.COMPARE_BY_COST);
        printCart();
    }

    // Getter and Setter

    public int getNumOfDVDs() {
        return numOfDVDs;
    }

    public void setNumOfDVDs(int numOfDVDs) {
        this.numOfDVDs = numOfDVDs;
    }

    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
}
