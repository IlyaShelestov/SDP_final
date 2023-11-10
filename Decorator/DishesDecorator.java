package FinalProject.Decorator;

import FinalProject.Factory.Cuisine;

public abstract class DishesDecorator implements FinalProject.Factory.Cuisine {
    Cuisine Cuisine;

    public DishesDecorator(Cuisine cuisine) {
        this.Cuisine = cuisine;
    }

    @Override
    public String getDescription() {
        return Cuisine.getDescription();
    }

    @Override
    public double getCost() {
        return Cuisine.getCost();
    }
}
