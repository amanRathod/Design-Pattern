package amanrathod.pro.InheritancePolymorphism;

import java.util.Arrays;

public class Present {
    private static final int DEFAULT_GIFT_CAPACITY = 10;
    private Sweet[] sweets;
    private int lastIndexAdded;

    {
        sweets = new Sweet[DEFAULT_GIFT_CAPACITY];
    }

    public void addSweet(Sweet sweet) {
        if (sweet == null) return;

        if (sweets.length <= lastIndexAdded) {
            sweets = Arrays.copyOf(sweets, sweets.length * 2);
        }

        sweets[lastIndexAdded++] = sweet;
    }

    // the method filters sweets by sugar weight inclusively
    public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
        int matchSweetsAmount = 0;

        for (Sweet sweet: sweets) {
            if (sweet != null && (sweet.getSugarWeight() >= minSugarWeight
                    && sweet.getSugarWeight() <= maxSugarWeight)) {
                matchSweetsAmount++;
            }
        }

        Sweet[] filteredSweets = new Sweet[matchSweetsAmount];
        int index = 0;

        for (Sweet sweet : sweets) {
            if (sweet != null && (sweet.getSugarWeight() >= minSugarWeight
                    && sweet.getSugarWeight() <= maxSugarWeight)) {
                filteredSweets[index++] = sweet;
            }
        }

//        return Arrays.stream(sweets)
//					.filter(Objects::nonNull)
//					.filter( (sweet) -> {
//						if (sweet.getSugarWeight() >= minSugarWeight &&
//								sweet.getSugarWeight() <= maxSugarWeight) {
//							return true;
//						} else {
//							return false;
//						}
//					})
//					.toArray(Sweet[]::new);

        return filteredSweets;
    }

    // the method calculates total weight of the present
    public double calculateTotalWeight() {
        double sumWeight = 0;

        for (Sweet sweet : sweets) {
            if (sweet != null) {
                sumWeight += sweet.getWeight();
            }
        }

//        return Arrays.stream(sweets)
//					.filter(Objects::nonNull)
//					.mapToDouble(sweet -> sweet.getWeight())
//					.sum();

        return sumWeight;
    }

    // the method returns copy of the Sweet[] array so that nobody could
    // modify state of the present without addSweet() method.
    // Also array shouldn’t contain null values.
    public Sweet[] getSweets() {
        int nonNullSweetsAmount = 0;

        for (Sweet sweet : sweets) {
            if (sweet != null) {
                nonNullSweetsAmount++;
            }
        }

        Sweet[] nonNullSweets = new Sweet[nonNullSweetsAmount];
        int index = 0;

        for (Sweet sweet : this.sweets) {
            if (sweet != null) {
                nonNullSweets[index++] = sweet;
            }
        }

//        return Arrays.stream(sweets)
//					.filter(Objects::nonNull)
//					.toArray(Sweet[]::new);

        return nonNullSweets;
    }
}
