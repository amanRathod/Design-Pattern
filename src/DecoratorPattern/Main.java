package DecoratorPattern;

import DecoratorPattern.Decorator.ExtraCheese;
import DecoratorPattern.Decorator.Mushroom;

public class Main {
    public static void main(String args[]) {
        BasePizza pizza = new Margherita();
        BasePizza cheese = new ExtraCheese(pizza);
        BasePizza mushroom = new Mushroom(cheese);

        System.out.println(mushroom.cost());
    }
}
