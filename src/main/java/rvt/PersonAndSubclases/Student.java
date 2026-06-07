package rvt.PersonAndSubclases;

public class Student extends Person {
    public Student(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return "Student: " + getName() + "\n  " + getAddress();
    }
}
