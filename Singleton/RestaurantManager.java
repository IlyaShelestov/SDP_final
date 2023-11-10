package FinalProject.Singleton;

import FinalProject.Observer.Customer;
import FinalProject.Observer.NotificationManager;
import FinalProject.Observer.Observer;
import FinalProject.Strategy.PayStrategy;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {

    private static RestaurantManager instance;
    private PayStrategy payStrategy;

    private List<Customer> customers;
    NotificationManager notificationManager;

    private RestaurantManager() {
        customers = new ArrayList<>();
        notificationManager = new NotificationManager();
    }

    public static RestaurantManager getInstance() {
        if (instance == null) {
            instance = new RestaurantManager();
        }
        return instance;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void showCustomers(){
        customers.stream().forEach(System.out::println);
    }

    public void showCustomersWithNotifications(){
        notificationManager.getCustomersWithNotifications().stream().forEach(System.out::println);
    }

    public void removeCustomer(int id){
        customers.remove(id);
    }

    public NotificationManager getNotificationManager() {
        return notificationManager;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void pay(double amount, String currency) {
        payStrategy.pay(amount, currency);
    }

}
