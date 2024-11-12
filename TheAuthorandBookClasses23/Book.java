package TheAuthorandBookClasses23;

public class Book {
    String isbn;
    String name;
    Author authour;
    double price;
    int qty = 0;

    Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.authour = author;
        this.price = price;
    }

    Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.authour = author;
        this.price = price;
        this.qty = qty;
    }

    String getIsbn() {
        return isbn;
    }

    String getName() {
        return name;
    }

    Author getAuthour() {
        return authour;
    }

    double getPrice() {
        return price;
    }

//    void setPrie(double price) {
//
//        int getQty () {
//            return qty;
//        }
//        void setQty ( int qty){
//            this.qty = qty;
//        }
//
//    }
}

