package rvt.PersonAndSubclases;

public class Teacher extends Person {
    public Teacher(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return "Teacher: " + getName() + "\n  " + getAddress();
    }
}
