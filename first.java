import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.roll+" "+s1.name);
        s1.greetings();
    }
}

class Student{
    int roll;
    String name;
    
    void greetings(){
        System.out.println("Welcome "+name);
    }
    
    Student(){
        this.roll=45;
        this.name="taj";
    }
}
