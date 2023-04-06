package FactoryPattern;

// Child Class
public class Student extends Person {
    private String name;
    private String gender;
    private String qualification;

    public Student(String name, String gender, String qualification) {
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
