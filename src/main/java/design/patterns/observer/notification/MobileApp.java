package design.patterns.observer.notification;

import design.patterns.observer.order.Order;

public class MobileApp implements Observer {

    @Override
    public void updateStatus(Order order) {
        System.out.println("MOBILE APP SERVICE: Order " + order.getOrderNumber()
                + " changed status to: " + order.getOrderStatus());
    }
}
