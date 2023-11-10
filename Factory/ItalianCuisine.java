package FinalProject.Factory;

import FinalProject.Factory.Cuisine;

public class ItalianCuisine implements Cuisine {
    @Override
    public String getDescription() {
        return "Serving Italian food";
    }

    @Override
    public double getCost() {
        return 1.00;
    }
}
