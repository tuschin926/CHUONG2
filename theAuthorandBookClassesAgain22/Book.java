package theAuthorandBookClassesAgain22;

import java.util.Arrays;

public class Book {
    String name;
    Author[] authors;
    double price;
    int qty = 0;

    Book(String name, theAuthorandBookClassesAgain22.Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    Book(String name, theAuthorandBookClassesAgain22.Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }



    String getName() {
        return name;
    }

    theAuthorandBookClassesAgain22.Author[] getAuthors() {
        return authors;
    }


    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    int getQty() {
        return qty;
    }

    void setQty(int qtyty) {
        this.qty = qty;

    }


    public String toString() {
        return "Book[name=" + name + "," + Arrays.toString(authors) + ",price" + price + ",qty" + qty + "]";
    }
}
