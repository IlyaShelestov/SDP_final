package FinalProject.Decorator;

import FinalProject.Decorator.DishesDecorator;

public class Kespe extends DishesDecorator {
    public Kespe(FinalProject.Factory.Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", kespe";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
