package factory_Pattern;

// Child Class
public class TeachingAssistant extends Person {
    private String name;
    private String gender;
    private String qualification;

    public TeachingAssistant(String name, String gender, String qualification) {
        this.name = name;
        this.gender = gender;
        this.qualification = qualification;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public String getQualification() {
        return this.qualification;
    }
}
