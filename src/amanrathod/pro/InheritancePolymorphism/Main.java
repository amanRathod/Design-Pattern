package amanrathod.pro.InheritancePolymorphism;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Candy candy = new ChocolateCandy("Dairy milk", 10, 0.2, "chocolate", SweetType.CANDY);
        candy.setWeight(0.5);
        System.out.println(candy);

        Candy lollipop = new Lollipop();
        lollipop.setName("poppins");
        lollipop.setFlavor("vanilla");
        lollipop.setWeight(0.3);
        lollipop.setSugarWeight(0.1);
        lollipop.setSweetType(SweetType.CANDY);
        System.out.println(lollipop);

        Cookie cookie = new Oreo();
        cookie.setName("Milk Oreo");
        cookie.setWeight(0.5);
        cookie.setSugarWeight(0.3);
        cookie.setSweetType(SweetType.COOKIE);
        cookie.setIsSoft(true);
        System.out.println(cookie);

        Present present = new Present();
        present.addSweet(candy);
        present.addSweet(cookie);
        present.addSweet(lollipop);

        Sweet[] filteredSweets = present.filterSweetsBySugarRange(0, 0.20);
        System.out.println(Arrays.toString(filteredSweets));

        System.out.println("Total weight of the present: " + present.calculateTotalWeight());

        System.out.println("All sweets" + Arrays.toString(present.getSweets()));
    }
}
