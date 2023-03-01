package builderPattern;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new CustomerBuilder()
                .setFirstName("Aman").setLastName("Singh").setAge(22).build();

        System.out.println(customer1.toString());
    }
}
