package inheritance.singel;

public class SingleTest {
    public static void main(String[] args) {
        // Objek Person
        Person p = new Person("Ainun", 25);
        p.displayInfo();
        p.greet();
        System.out.println();
        
        // Objek Student
        Student s = new Student("Anisa", 20, "S123", "Informatika");
        s.displayInfo();
        s.greet();
        s.study();
        System.out.println();
        
        // Polymorphism
        Person poly = new Student("rafi", 22, "S456", "Sistem Informasi");
        poly.displayInfo();  // yang dipanggil versi Student
    }
}
