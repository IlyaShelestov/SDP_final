package FinalProject.Decorator;

import FinalProject.Decorator.DishesDecorator;

public class Borsch extends DishesDecorator {
    public Borsch(FinalProject.Factory.Cuisine cuisine) {
        super(cuisine);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", borsch";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.7;
    }
}
