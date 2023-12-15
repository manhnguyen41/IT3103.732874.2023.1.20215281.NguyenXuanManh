package lab05.AimsProject;

import lab05.AimsProject.exception.PlayerException;
import lab05.AimsProject.media.*;

import java.util.Scanner;

public class Aims {
    // Create a new store
    static Store store = new Store();
    // Create a new cart
    static Cart cart = new Cart();
    public static void showMenu() throws Exception {
        int command;
        do {
            Scanner scanner = new Scanner(System.in);
            // Show store
            System.out.println("AIMS: ");
            System.out.println("--------------------------------");
            System.out.println("1. View store");
            System.out.println("2. Update store");
            System.out.println("3. See current cart");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3");
            command = scanner.nextInt();

            // If chose View store
            if (command == 1) {
                store.printStore();
                storeMenu();
            }

            // If chose 2
            if (command == 2) {
                updateStoreMenu();
            }

            // If chose 3
            if (command == 3) {
                cart.printCart();
                cartMenu();
            }
        } while (command != 0);
    }

    public static void updateStoreMenu() throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Show menu
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add a media to store");
        System.out.println("2. Remove a media from cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
        int command = scanner.nextInt();

        // If chose 1
        if (command == 1) {
            System.out.println("Added to store");
        }

        // If chose 2
        if (command == 2) {
            removeMediaFromStore();
        }
    }

    public static void storeMenu() throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Show menu
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
        int command = scanner.nextInt();

        // If chose 1
        if (command == 1) {
            Media media;
            do {
                System.out.println("Enter the title of the media: ");
                scanner.nextLine();
                String title = scanner.nextLine();
                media = store.searchByTitle(title);
            } while (media == null);
            media.print();
            mediaDetailsMenu(media);
        }

        // If chose 2
        if (command == 2) {
            addMediaToCart();
        }

        // If chose 3
        if (command == 3) {
            Media media;
            do {
                System.out.println("Enter the title of the media: ");
                scanner.nextLine();
                String title = scanner.nextLine();
                media = store.searchByTitle(title);
            } while (media == null);
            playAMedia(media);
        }

        // If chose 4
        if (command == 4) {
            cart.printCart();
            cartMenu();
        }
    }

    public static void mediaDetailsMenu(Media media) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Show menu
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        if (!(media instanceof Book)) {
            System.out.println("2. Play");
        }
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1");
        if (!(media instanceof Book)) {
            System.out.println("-2");
        }
        int command = scanner.nextInt();

        // If chose 1
        if (command == 1) {
            cart.addMedia(media);
        }

        // If chose 2
        if (command == 2) {
            playAMedia(media);
        }
    }

    public static void cartMenu() throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Show menu
        System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
        int command = scanner.nextInt();

        // If chose 1
        if (command == 1) {
            filterCartMenu();
        }

        // If chose 2
        if (command == 2) {
            sortCartMenu();
        }

        // If chose 3
        if (command == 3) {
            removeMediaFromCart();
        }

        // If chose 4
        if (command == 4) {
            Media media;
            do {
                System.out.println("Enter the title of the media: ");
                String title = scanner.nextLine();
                media = cart.searchByTitle(title);
            } while (media == null);
            playAMedia(media);
        }

        // If chose 5
        if (command == 5) {
            System.out.println("Order is created");
            cart = new Cart();
        }
    }

    public static void filterCartMenu() throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Show menu
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. By id");
        System.out.println("2. By title");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
        int command = scanner.nextInt();

        // If chose 1
        if (command == 1) {
            System.out.println("Enter the id: ");
            int id = scanner.nextInt();
            Media media = cart.searchByID(id);
            if (media != null) {
                media.print();
            }
        }

        // If chose 2
        if (command == 2) {
            System.out.println("Enter the title: ");
            scanner.nextLine();
            String title = scanner.nextLine();
            Media media = cart.searchByTitle(title);
            if (media != null) {
                media.print();
            }
        }
    }

    public static void sortCartMenu() {
        Scanner scanner = new Scanner(System.in);
        // Show menu
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. By title");
        System.out.println("2. By cost");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
        int command = scanner.nextInt();

        // If chose 1
        if (command == 1) {
            cart.sortByTitle();
        }

        // If chose 2
        if (command == 2) {
            cart.sortByCost();
        }
    }

    public static void removeMediaFromCart() throws Exception {
        Scanner scanner = new Scanner(System.in);
        Media media;
        do {
            System.out.println("Enter the title of the media: ");
            String title = scanner.nextLine();
            media = cart.searchByTitle(title);
        } while (media == null);
        cart.removeMedia(media);
    }

    public static void removeMediaFromStore() throws Exception {
        Scanner scanner = new Scanner(System.in);
        Media media;
        do {
            System.out.println("Enter the title of the media: ");
            String title = scanner.nextLine();
            media = store.searchByTitle(title);
        } while (media == null);
        store.removeMedia(media);
    }

    public static void playAMedia(Media media) throws PlayerException {
        if (media instanceof DigitalVideoDisc dvd) {
            dvd.play();
        } else if (media instanceof CompactDisc cd) {
            cd.play();
        }
    }

    public static void addMediaToCart() throws Exception {
        Scanner scanner = new Scanner(System.in);
        Media media;
        do {
            System.out.println("Enter the title of the media: ");
            String title = scanner.nextLine();
            media = store.searchByTitle(title);
        } while (media == null);
        cart.addMedia(media);
        if (media instanceof DigitalVideoDisc) {
            System.out.println("Number of DVDs in the current cart: " + cart.getNumOfDVDs());
        }
    }

    public static void main(String[] args) throws Exception {
        // Create new media and add them to the store
        // Adding DVDs
        Media dvd1 = new lab05.AimsProject.media.DigitalVideoDisc(1, "Inception",
                "Science Fiction", "Christopher Nolan", 148, 19.99f);
        store.addMedia(dvd1);

        Media dvd2 = new lab05.AimsProject.media.DigitalVideoDisc(2, "The Dark Knight",
                "Action", "Christopher Nolan", 152, 17.99f);
        store.addMedia(dvd2);

        Media dvd3 = new DigitalVideoDisc(7, "Interstellar",
                "Science Fiction", "Christopher Nolan", 169, 21.99f);
        store.addMedia(dvd3);

        // Adding CDs
        Media cd1 = new CompactDisc(3, "Random Access Memories",
                "Electronic", 15.99f, "Daft Punk", 13, "Daft Punk");
        store.addMedia(cd1);

        Media cd2 = new CompactDisc(4, "25",
                "Pop", 14.99f, "Adele", 11, "Adele");
        store.addMedia(cd2);

        Media cd3 = new CompactDisc(8, "Lover",
                "Pop", 17.99f, "Taylor Swift", 18, "Taylor Swift");
        store.addMedia(cd3);

        // Adding Books
        Media book1 = new Book(5, "The Silent Patient",
                "Thriller", 14.95f);
        store.addMedia(book1);

        Media book2 = new Book(6, "Where the Crawdads Sing",
                "Mystery", 12.99f);
        store.addMedia(book2);

        Media book3 = new Book(9, "Educated",
                "Memoir", 16.95f);
        store.addMedia(book3);

        Media book4 = new Book(10, "Becoming",
                "Autobiography", 22.99f);
        store.addMedia(book4);
        showMenu();
    }
}
