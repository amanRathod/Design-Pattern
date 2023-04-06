package DecoratorPattern.Decorator;

import DecoratorPattern.BasePizza;

public class ExtraCheese extends ToppingDecorator {
    // this implies "has-a" relationship with base class (BasePizza)
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
