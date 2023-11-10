package FinalProject.Observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {
    private List<Observer> customersWithNotifications;

    public NotificationManager() {
        customersWithNotifications = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        customersWithNotifications.add(observer);
    }

    public void removeObserver(int id){
        customersWithNotifications.remove(id);
    }

    public List<Observer> getCustomersWithNotifications() {
        return customersWithNotifications;
    }

    public void notifyObservers(String line){
        for (Observer customersWithNotification : customersWithNotifications) {
            customersWithNotification.update(line);
        }

    }




}
