package FinalProject.Factory;

import FinalProject.Factory.Cuisine;

public class RussianCuisine implements Cuisine {
    @Override
    public String getDescription() {
        return "Serving Russian food";
    }

    @Override
    public double getCost() {
        return 1.00;
    }
}
