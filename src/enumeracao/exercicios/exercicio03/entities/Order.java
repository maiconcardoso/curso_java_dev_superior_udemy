package enumeracao.exercicios.exercicio03.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import enumeracao.exercicios.exercicio03.entities.enums.OrderStatus;

public class Order {

    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public Double total() {
        double sum = 0;
        for (OrderItem item: orderItems) {
            sum += item.subTotal();
        }
        return sum;
    }
}
