package rvt.PersonAndSubclasses.java;

public class Main {
public static void main(String[] args) {
        // write your test code here
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Igors Litvjakovs", "Bultu iela 6. Riga"));
        persons.add(new Student("Mareks", " Kengaraga iela 1, Riga"));

        printPersons(persons);
    }

    public static void printPersons (ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
