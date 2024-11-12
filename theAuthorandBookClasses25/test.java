package theAuthorandBookClasses25;

public class test {
    public static void main(String [] args){
        Customer a= new Customer(100,"trinh",'m');
        System.out.println(a);


        Account b=new Account(99,a,199.9);
        System.out.println("id : "+b.getId());
        System.out.println("balance : "+b.getBalance());
        System.out.println("customer name :"+b.getCustomerName());
        b.deposit(100.9);
        System.out.println("deposit :"+b);
        b.withdraw(100);
        System.out.println("withraw : "+b);




    }
}




