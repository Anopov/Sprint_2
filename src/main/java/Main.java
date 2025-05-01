import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.*;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50, RED);
        Food greenApple = new Apple(8, 60, GREEN);

        Food[] foods = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.printf("Общая сумма товаров без скидки: %s\n", shoppingCart.getAllPriceWithoutDiscount());
        System.out.printf("Общая сумма товаров со скидкой: %s\n", shoppingCart.getAllPriceWithDiscount());
        System.out.printf("Сумма всех вегетарианских продуктов без скидки: %s\n", shoppingCart.getVeganProductsWithoutDiscount());
    }
}
