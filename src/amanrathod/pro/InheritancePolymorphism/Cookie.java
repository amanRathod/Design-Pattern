package amanrathod.pro.InheritancePolymorphism;

public abstract class Cookie extends Sweet {
    private boolean isSoft;

    public Cookie(){
        super();
    }
    public Cookie(String name, int weight, double sugarWeight, boolean isSoft, SweetType sweetType) {
        super(name, weight, sugarWeight, sweetType);
        this.isSoft = isSoft;
    }

    public boolean isSoft() {
        return this.isSoft;
    }

    public void setIsSoft(boolean isSoft) {
        this.isSoft = isSoft;
    }
}
