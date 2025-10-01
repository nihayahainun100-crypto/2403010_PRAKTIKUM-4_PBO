package inheritance.singel;

// File: Student.java
public class Student extends Person {
    private String studentId;
    private String major;
    
    public Student(String name, int age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("ID Mahasiswa: " + studentId);
        System.out.println("Jurusan: " + major);
    }
    
    public void study() {
        System.out.println(name + " sedang belajar " + major);
    }
}
