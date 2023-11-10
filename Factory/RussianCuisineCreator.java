package FinalProject.Factory;

import FinalProject.Factory.Cuisine;
import FinalProject.Factory.CuisineFactory;
import FinalProject.Factory.RussianCuisine;

public class RussianCuisineCreator extends CuisineFactory {
    @Override
    public Cuisine createCuisine() {
        return new RussianCuisine();
    }
}
