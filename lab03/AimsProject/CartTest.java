package lab03.AimsProject;

public class CartTest {
    public static void main(String[] args) {
        //Create a new cart
        Cart cart = new Cart();
        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc ("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc (dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc (dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc ("Aladin",
                "Animation", 18.99f);
        cart.addDigitalVideoDisc (dvd3);
        //Test the print method
        cart.printCart();
        //To-do: Test the search methods here
        cart.searchByID(1);
        cart.searchByID(4);
        cart.searchByTitle("Star Wars");
        cart.searchByTitle("Harry Potter");
    }
}