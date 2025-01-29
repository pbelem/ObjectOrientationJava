package entities;

import entities.enums.OrderStatus;
import service.HourContract;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order2 {

    Date moment;
    OrderStatus status;

    private List<OrderItem> items = new ArrayList<>();
    Client client = new Client();

    public Order2() {

    }
    public Order2(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
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
        return 0;
    }
}
