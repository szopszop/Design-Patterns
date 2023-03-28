package design.patterns.observer.notification;

import design.patterns.observer.order.Order;

public class MobileApp {
    public void updateOrderStatus(Order order) {
        System.out.println("MOBILE APP SERVICE: Order " + order.getOrderStatus() + " has been sent");
    }
}
