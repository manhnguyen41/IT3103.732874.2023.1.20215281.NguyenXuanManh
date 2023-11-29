package lab04.AimsProject;

import lab04.AimsProject.Media.Book;
import lab04.AimsProject.Media.CompactDisc;
import lab04.AimsProject.Media.DigitalVideoDisc;
import lab04.AimsProject.Media.Media;

public class CartTest {
    public static void main(String[] args) {
        // Create a new store
        Store store = new Store();
        // Create new media and add them to the store
        // Adding DVDs
        Media dvd1 = new DigitalVideoDisc(1, "Inception",
                "Science Fiction", "Christopher Nolan", 148, 19.99f);
        store.addMedia(dvd1);

        Media dvd2 = new DigitalVideoDisc(2, "The Dark Knight",
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
    }
}