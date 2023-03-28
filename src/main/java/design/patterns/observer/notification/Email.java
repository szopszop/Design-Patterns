package design.patterns.observer.notification;

import design.patterns.observer.order.Order;

public class Email {

    public void updateOrderStatus(Order order) {
        System.out.println("EMAIL SERVICE: Order " + order.getOrderStatus() + " has been sent");
    }
}
