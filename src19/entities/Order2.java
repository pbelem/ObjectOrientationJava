package entities;

import entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order2 {

    Date moment;
    OrderStatus status;

    private final List<OrderItem> items = new ArrayList<>();
    Client client;

    public Order2() {
    }

    public Order2(Date date, String s, Client client) {
        moment = date;
        status = OrderStatus.valueOf(s);
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ").append(moment).append("\n")
                .append("Status: ").append(status).append("\n")
                .append("Client: ").append(client.nameClient).append(" ").append("\n")
                .append(client.birthDate).append(" - ").append(client.emailClient).append("\n")
                .append("Order items: \n");
        for (OrderItem item : items) {
            sb.append(item.product.getNameProduct()).append("\n")
                    .append("Quantity: ").append(item.quantity).append("\n")
                    .append("Subtotal: ").append(item.subTotal()).append("\n");
        }
        sb.append("Total price: ").append(total()).append("\n");
        return sb.toString();
    }
}
