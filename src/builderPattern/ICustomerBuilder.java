package builderPattern;

public interface ICustomerBuilder {
    public ICustomerBuilder setFirstName(String firstName);
    public ICustomerBuilder setLastName(String lastName);
    public ICustomerBuilder setMiddleName(String middleName);
    public ICustomerBuilder setAge(Integer age);
}
