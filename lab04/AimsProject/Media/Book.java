package lab04.AimsProject.Media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    // Attribute
    private List<String> authors = new ArrayList<String>();

    // Constructor
    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    // Method to add an author
    public void addAuthor(String authorName) {
        int indexOfAuthor = authors.indexOf(authorName);
        if (indexOfAuthor == -1) {
            System.out.println("Author is already in the list");
            return;
        }
        authors.add(authorName);
        System.out.println("Added");
    }

    // Method to remove an author
    public void removeAuthor(String authorName) {
        int indexOfAuthor = authors.indexOf(authorName);
        if (indexOfAuthor == -1) {
            System.out.println("Author is absent in the list");
            return;
        }
        authors.remove(indexOfAuthor);
        System.out.println("Removed");
    }

    // Method to print a book
    @Override
    public void print() {
        System.out.print(getId() + ". Book - "
                + getTitle() + " - "
                + getCategory() + " - ");
        for (String author: authors) {
            System.out.print(author + " - ");
        }
        System.out.println(getCost() + "$");
    }

    // Getter and Setter
    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
