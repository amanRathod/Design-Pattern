package factory_Pattern;

// Factory Class
public class PersonFactory {
    public static Person createPerson(String type, String name, String gender, String qualification) {
        switch (type) {
            case "Professor":
                return new Professor(name, gender, qualification);
            case "Teaching Assistant":
                return new TeachingAssistant(name, gender, qualification);
            case "Student":
                return new Student(name, gender, qualification);
            default:
                return null;
        }
    }
}
