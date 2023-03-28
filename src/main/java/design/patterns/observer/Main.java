package design.patterns.observer;

import design.patterns.observer.notification.MobileApp;
import design.patterns.observer.notification.SMS;
import design.patterns.observer.notification.Email;
import design.patterns.observer.order.Order;
import design.patterns.observer.order.OrderStatus;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(110L, OrderStatus.REGISTERED);

        SMS textMessage = new SMS();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        textMessage.updateStatus(order);
        mobileApp.updateStatus(order);
        email.updateStatus(order);
    }
}
