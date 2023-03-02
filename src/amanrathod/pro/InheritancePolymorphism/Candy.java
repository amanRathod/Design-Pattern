package amanrathod.pro.InheritancePolymorphism;

public class Candy extends Sweet {
    private String flavor;

    public Candy() {
        super();
    }
    public Candy(String name, double weight, double sugarWeight, String flavor, SweetType sweetType) {
        super(name, weight, sugarWeight, sweetType);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return this.flavor;
    }

    public void setFlavor(String flavor){
        this.flavor = flavor;
    }
}
