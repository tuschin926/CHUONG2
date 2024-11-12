package theAuthorandBookClasses25;

public class Customer {
    int id;
    static String name;
    char gender;


    Customer(int id, String name, char gender){
        this.id=id;
        this.name=name;
        this.gender=gender;
    }
    int getId(){
        return  id;
    }

    public void setId(int id) {
        this.id = id;
    }
    static String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    char getGender(){
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "name("+id+")";
    }
}
