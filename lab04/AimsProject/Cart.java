package lab04.AimsProject;

import lab04.AimsProject.Media.Media;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    // Attribute
    private List<Media> itemsOrdered = new ArrayList<Media>();

    // Constructor
    public Cart() {
    }

    // Method to add a new media
    public void addMedia(Media media) {
        itemsOrdered.add(media);
        System.out.println("Added");
    }

    // Method to remove a media
    public void removeMedia(Media media) {
        // Search for media
        int indexOfRemoved = itemsOrdered.indexOf(media);

        // If not found
        if (indexOfRemoved == -1) {
            System.out.println("Not found");
            return;
        }

        // Remove
        itemsOrdered.remove(indexOfRemoved);

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
    public void searchByID(int id) {
        boolean found = false;
        for (Media media: itemsOrdered) {
            if (media.getId() == id) {
                found = true;
                media.print();
            }
        }
        if (!found) {
            System.out.println("Not found!");
        }
    }

    // Method to search for DVDs in the cart by title and print the results.
    public void searchByTitle(String title) {
        boolean found = false;
        for (Media media: itemsOrdered) {
            if (media.isMatch(title)) {
                found = true;
                media.print();
            }
        }
        if (!found) {
            System.out.println("Not found!");
        }
    }

    // Getter and Setter
}
