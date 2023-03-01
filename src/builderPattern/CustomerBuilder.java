package builderPattern;

public class CustomerBuilder implements ICustomerBuilder {
    private  String firstName;
    private  String lastName;
    private  String middleName;
    private  Integer age;



    @Override
    public CustomerBuilder setFirstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public CustomerBuilder setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public CustomerBuilder setMiddleName(final String middleName) {
        this.middleName = middleName;
        return this;
    }

    @Override
    public CustomerBuilder setAge(final Integer age) {
        this.age = age;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Customer build() {
        return new Customer(this);
    }
}
