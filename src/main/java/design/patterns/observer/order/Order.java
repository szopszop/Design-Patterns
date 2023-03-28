package design.patterns.observer.order;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {

    private Long orderNumber;
    private OrderStatus orderStatus;
}
