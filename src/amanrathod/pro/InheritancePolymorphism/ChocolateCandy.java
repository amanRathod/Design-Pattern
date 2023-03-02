package amanrathod.pro.InheritancePolymorphism;

public class ChocolateCandy extends Candy {

    public ChocolateCandy(){
        super();
    }

    public ChocolateCandy(String name, double weight, double sugarWeight, String flavour, SweetType sweetType) {
        super(name, weight, sugarWeight, flavour, sweetType);
    }
}
