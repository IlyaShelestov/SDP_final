package FinalProject.Factory;

import FinalProject.Factory.Cuisine;
import FinalProject.Factory.CuisineFactory;
import FinalProject.Factory.ItalianCuisine;

public class ItalianCuisineCreator extends CuisineFactory {
    @Override
    public Cuisine createCuisine() {
        return new ItalianCuisine();
    }
}
