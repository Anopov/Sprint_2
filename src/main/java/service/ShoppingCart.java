package service;

import model.Apple;
import model.Food;

import static model.constants.Colour.RED;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getAllPriceWithoutDiscount() {
        double sum = 0;
        for (Food f : foods) {
            sum += f.getPrice() * f.getAmount();
        }

        return sum;
    }

    public double getAllPriceWithDiscount() {
        double sum = 0;
        for (Food f : foods) {
            sum += f.getPrice() * (1 - f.getDiscount()) * f.getAmount();
        }

        return sum;
    }

    public double getVeganProductsWithoutDiscount() {
        double sum = 0;

        for (Food f : foods) {
            if (f.isVegetarian()) {
                sum += f.getAmount() * f.getPrice();
            }
        }

        return sum;
    }
}
