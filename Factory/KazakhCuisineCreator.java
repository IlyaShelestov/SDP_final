package FinalProject.Factory;

import FinalProject.Factory.Cuisine;
import FinalProject.Factory.CuisineFactory;
import FinalProject.Factory.KazakhCuisine;

public class KazakhCuisineCreator extends CuisineFactory {
    @Override
    public Cuisine createCuisine() {
        return new KazakhCuisine();
    }
}
