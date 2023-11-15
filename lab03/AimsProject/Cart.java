package lab03.AimsProject;

public class Cart {
    // Attribute
    private DigitalVideoDisc []itemsOrdered =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    private int qtyOrdered;

    public static final int MAX_NUMBERS_ORDERED = 20;

    // Constructor
    public Cart() {
        setQtyOrdered(0);
    }

    // Setter and Getter
    public DigitalVideoDisc[] getItemsOrdered() {
        return itemsOrdered;
    }

    public void setItemsOrdered(DigitalVideoDisc[] itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    // Method to add a new DVD
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        // If cart is full
        if (getQtyOrdered() >= 20) {
            System.out.println("The cart is almost full");
            return;
        }

        // Increase the qtyOrdered
        setQtyOrdered(getQtyOrdered() + 1);

        // Add to cart
        DigitalVideoDisc []newItemsOrdered = getItemsOrdered();
        newItemsOrdered[getQtyOrdered() - 1] = disc;
        setItemsOrdered(newItemsOrdered);

        // Notify
        System.out.println("The disc has been added");
    }

    // Method to add list new DVDs
    public void addDigitalVideoDisc(DigitalVideoDisc []dvdList) {
        // If cart is full
        if (qtyOrdered + dvdList.length > 20) {
            System.out.println("The cart is almost full");
            return;
        }

        // Add to cart
        System.arraycopy(dvdList, 0, itemsOrdered, qtyOrdered, dvdList.length);

        // Increase the qtyOrdered
        qtyOrdered += dvdList.length;

        // Notify
        System.out.println("The list has been added");
    }

    // Method to add two new DVD
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
        // If cart is full
        if (qtyOrdered >= 19) {
            System.out.println("The cart is almost full");
            return;
        }

        // Increase the qtyOrdered
        qtyOrdered += 2;

        // Add to cart
        itemsOrdered[qtyOrdered - 2] = dvd1;
        itemsOrdered[qtyOrdered - 1] = dvd1;

        // Notify
        System.out.println("The disc has been added");
    }

    // Method to remove a DVD
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        // Search for disc
        int indexOfRemoved = -1;
        DigitalVideoDisc []newItemsOrdered = getItemsOrdered();
        for (int i = 0; i < getQtyOrdered(); i++) {
            if (newItemsOrdered[i].equals(disc)) {
                indexOfRemoved = i;
                break;
            }
        }

        // If not found
        if (indexOfRemoved == -1) {
            System.out.println("The disc is not found");
            return;
        }

        // Remove
        for (int i = indexOfRemoved; i < getQtyOrdered() - 1; i++) {
            newItemsOrdered[i] = newItemsOrdered[i + 1];
        }
        setQtyOrdered(getQtyOrdered() - 1);
        newItemsOrdered[getQtyOrdered() - 1] = null;
        setItemsOrdered(newItemsOrdered);

        // Notify
        System.out.println("The disc has been removed");
    }

    // Method to calculate the total cost
    public double totalCost() {
        double cost = 0;
        DigitalVideoDisc []itemsOrdered = getItemsOrdered();
        for (DigitalVideoDisc disc: itemsOrdered) {
            if (disc != null) {
                cost += disc.getCost();
            }
        }

        return Math.round(cost * 100.0) / 100.0;
    }

    // Method to print the list of ordered items of a cart,
    // the price of each item, and the total price
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd != null)
                dvd.printDVD();
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("**************************************************");
    }

    // Method to search for DVDs in the cart by ID and display the search results.
    public void searchByID(int id) {
        boolean found = false;
        for (DigitalVideoDisc dvd: itemsOrdered) {
            if (dvd != null && dvd.getId() == id) {
                found = true;
                dvd.printDVD();
            }
        }
        if (!found) {
            System.out.println("Not found!");
        }
    }

    // Method to search for DVDs in the cart by title and print the results.
    public void searchByTitle(String title) {
        boolean found = false;
        for (DigitalVideoDisc dvd: itemsOrdered) {
            if (dvd != null && dvd.isMatch(title)) {
                found = true;
                dvd.printDVD();
            }
        }
        if (!found) {
            System.out.println("Not found!");
        }
    }
}
