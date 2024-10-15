import java.io.Serializable;

public class User implements Serializable {
    //attributes
    private String name;
    private String password;
    private int age= 0;

    //Constructor
    public User(String name, String inPass, int inAge){
        this.name = name;
        password= inPass;
        age= inAge;
    }

    //method
    public void introduction(){
        System.out.println("Hello, my name is " + name + " and I am " + age);
    }
}
