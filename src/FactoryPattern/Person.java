package FactoryPattern;

// Super Class
public abstract class Person {
    public abstract String getName();
    public abstract String getGender();
    public abstract String getQualification();

    @Override()
    public String toString() {
        return "Name = " + this.getName() + ", Gender = " + this.getGender() + ", Qualification = " + this.getQualification();
    }
}
