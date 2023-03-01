package builderPattern;

public class Customer {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final Integer age;

    public Customer(CustomerBuilder builder) {
        this.firstName = builder.getFirstName();
        this.middleName = builder.getMiddleName();
        this.lastName = builder.getLastName();
        this.age = builder.getAge();
    }

    @Override()
    public String toString() {
        return "First Name is " + firstName + "\n" +
                "Last Name is " + lastName + "\n" +
                "Age is " + age;
    }
}
