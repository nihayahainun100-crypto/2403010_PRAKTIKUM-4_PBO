package inheritance.singel;

public class Person {

    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age);
    }
    
    public void greet() {
        System.out.println("Halo, saya " + name);
    }
}

