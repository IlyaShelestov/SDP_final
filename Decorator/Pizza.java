package FinalProject.Decorator;

import FinalProject.Decorator.DishesDecorator;

public class Pizza extends DishesDecorator {
    public Pizza(FinalProject.Factory.Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pizza";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.6;
    }
}
