package design.patterns.observer.notification;

import design.patterns.observer.order.Order;

public interface Observer {

    void updateStatus(Order order);
}
