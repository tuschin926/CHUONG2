package TheAuthorandBookClasses23;

public class Author {
    String name;
    String email;
    Author(String name, String email){
        this.name=name;
        this.email=email;
    }
    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
    void setEmail(String email){
        this.email=email;
    }
    public String toString() {
        return "Author[name=" + name + ",email=" + email + "]";
    }
    }


