package theAuthorandBookClasses24;

public class Customer {
    static int id;
    static String name;
    static int discount;

    Customer(int id, String name ,int discount){
        this.id=id;
        this.name=name;
        this.discount=discount;
    }
    static int getId(){
        return id;
    }
    static String getName(){
        return name;
    }
    static int getDiscount(){
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return "name("+id+")("+discount+"%)";
    }

}
