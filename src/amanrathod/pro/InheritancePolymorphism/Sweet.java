package amanrathod.pro.InheritancePolymorphism;

abstract class Sweet {
    private String name;
    private double weight;
    private double sugarWeight;
    private SweetType sweetType;

    public Sweet() {}

    public Sweet(String name, double weight, double sugarWeight, SweetType sweetType) {
        super();
        this.name = name;
        this.weight = weight;
        this.sugarWeight = sugarWeight;
        this.sweetType = sweetType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSugarWeight() {
        return this.sugarWeight;
    }

    public void setSugarWeight(double sugarWeight) {
        this.sugarWeight = sugarWeight;
    }

    public SweetType getSweetType() {
        return this.sweetType;
    }

    public void setSweetType(SweetType sweetType) {
        this.sweetType = sweetType;
    }
    @Override
    public String toString() {
        return "Sweet [type = " + this.sweetType + ", name = " + this.name + ", weight = " + this.weight + ", Sugar Weight = " + this.sugarWeight + "]";
    }
}
