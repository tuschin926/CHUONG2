package theAuthorandBookClasses25;

public class Account {
    int id;
    Customer customer;
    double balance=0.0;

    Account(int id, Customer customer,double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }
    Account(int id, Customer customer){
        this.id=id;
        this.customer=customer;
    }
    int getId(){
        return  id;
    }

    public void setId(int id) {
        this.id = id;
    }
    Customer getCustomer(){
        return  customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return customer+"balance=$"+balance;
    }
    String getCustomerName() {
        return Customer.getName();
    }
    Account deposit(double amount){
        balance+=amount;
        return  this;
    }
    Account withdraw(double amount){
        if(balance >= amount){
            balance-=amount;
        }else{
            System.out.println("Amount withrawn exceeds the current balance");
        }
        return this;
    }

}
