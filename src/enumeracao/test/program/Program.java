package enumeracao.test.program;

import java.time.LocalDate;

import enumeracao.test.entities.Order;
import enumeracao.test.enums.OrderStatus;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1782, LocalDate.now(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus[] os2 = OrderStatus.values();

        for (OrderStatus os3 : os2) {
            System.out.println(os3);
        }
    }
}
