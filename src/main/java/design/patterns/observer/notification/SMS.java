package design.patterns.observer.notification;

import design.patterns.observer.order.Order;

public class SMS implements Observer {
    public void updateStatus(Order order) {
        System.out.println("SMS SERVICE: Order " + order.getOrderStatus() + " has been sent");
    }
}
