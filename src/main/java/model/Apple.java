package model;

import static model.constants.Discount.DISCOUNT;
import static model.constants.Colour.*;

public class Apple extends Food{
    private String colour;

    public Apple(int amount, double price, String colour){
        super(amount, price);
        this.colour = colour;
        this.isVegetarian = true;
    }

    public String getColour(){
        return colour;
    }

    @Override
    public double getDiscount() {
        if(colour.equals(RED)){
            return DISCOUNT;
        } else {
            return 0;
        }
    }


}
