package lab03.AimsProject;

public class StoreTest {
    public static void main(String[] args) {
        //Create a new cart
        Store store = new Store();

        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        store.addDVD(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        store.addDVD(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        store.addDVD(dvd3);

        // Remove success
        store.removeDVD(dvd1);

        // Remove failed
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Harry Potter",
                "Fiction", 18.99f);
        store.removeDVD(dvd4);
    }
}
