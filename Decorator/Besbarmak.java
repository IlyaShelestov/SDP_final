package FinalProject.Decorator;

import FinalProject.Decorator.DishesDecorator;

public class Besbarmak extends DishesDecorator {
    public Besbarmak(FinalProject.Factory.Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", besbarmak";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.8;
    }
}
