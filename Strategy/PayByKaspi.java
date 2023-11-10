package FinalProject.Strategy;

import FinalProject.Strategy.PayStrategy;

public class PayByKaspi implements PayStrategy {
    @Override
    public void pay(double amount, String currency) {
        System.out.println("Payed " + amount + " " + currency + " with Kaspi");
    }
}
