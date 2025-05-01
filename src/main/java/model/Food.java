package model;

import static model.constants.Discount.DEFAULT_DISCOUNT;

public abstract class Food implements Discountable{
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public Food(int amount, double price){
        this.amount = amount;
        this.price = price;
    }

    public int getAmount(){
        return amount;
    }

    public double getPrice(){
        return price;
    }

    public boolean isVegetarian(){
        return isVegetarian;
    }

    @Override
    public double getDiscount(){
        return DEFAULT_DISCOUNT;
    }

}
