package theAuthorandBookClasses24;

public class Invoice {
    int id;
    Customer customer;
    double amount;


    Invoice(int id, Customer customer,double amount){
        this.id=id;
        this.customer=customer;
        this.amount=amount;
    }
    int getId(){
        return id;
    }
    Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    double getAmount(){
        return  amount;
    }
    void setAmount(double amount){
        this.amount=amount;
    }
    int getCustomerId(){
        return Customer.getId();
    }
    String getCustomerName(){
        return Customer.getName();
    }
    int  getCustomerDiscount(){
        return Customer.getDiscount();
    }
    double getAmountAfterDiscount(){
        return amount-amount*Customer.getDiscount()/100;
    }
    public String toString(){
        return "Invoice[id="+id+","+customer+",amount="+amount+"]";
    }

}
