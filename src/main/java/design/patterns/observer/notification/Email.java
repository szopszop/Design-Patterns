package design.patterns.observer.notification;

import design.patterns.observer.order.Order;

public class Email implements Observer {

    @Override
    public void updateStatus(Order order) {
        System.out.println("EMAIL SERVICE: Order " + order.getOrderNumber() + " has been sent");
    }


}
