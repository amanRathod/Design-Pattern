package FactoryPattern;

public class Main {

    public static void main(String[] args) {
        Person p1 = PersonFactory.createPerson("Professor", "Professor-1", "Male", "M.tech");
        System.out.println("This person is " + p1);

        Person p2 = PersonFactory.createPerson("Student", "Student-1", "Male", "final year");
        System.out.println("This person is " + p2);

        Person p3 = PersonFactory.createPerson("Teaching Assistant", "TA-1", "Male", "B.tech");
        System.out.println("This person is " + p3);
    }
}
