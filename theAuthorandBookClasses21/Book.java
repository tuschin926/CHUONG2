package theAuthorandBookClasses21;

public class Book {
    String name;
    Author author;
    double price;
    int qty = 0;

    Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    String getName() {
        return name;
    }

    Author getAuthor() {
        return author;
    }


    double getPrice() {
        return price;
    }
    void setPrice(double price){
        this.price=price;
    }
    int getQty(){
        return qty;
    }
    void setQty(int qtyty){
        this.qty=qty;

    }
    public String toString(){
        return "Book[name="+name+","+author+",price"+price+",qty"+qty+"]";
    }
}