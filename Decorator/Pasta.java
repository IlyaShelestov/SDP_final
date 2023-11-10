package FinalProject.Decorator;

import FinalProject.Decorator.DishesDecorator;

public class Pasta extends DishesDecorator {
    public Pasta(FinalProject.Factory.Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pasta";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.8;
    }
}
