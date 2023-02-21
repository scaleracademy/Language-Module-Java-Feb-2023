package org.scaler.enums;

public class Ecom {
    static int orderId = 1;

    enum OrderStatus {
        NEW, PROCESSING, SHIPPED, DELIVERED, CANCELLED
    }

    static class Order {
        Integer id;
        String address;
        OrderStatus status;

        void ship(String address) {
            this.address = address;
            status = OrderStatus.SHIPPED;
        }
    }

    static Order createOrder() {
        Order order = new Order();
        order.id = orderId++;
        order.status = OrderStatus.NEW;
        return order;
    }

    static void printOrderStatus(Order order) {
        switch (order.status) {
            case NEW -> {
                System.out.println("Order " + order.id + " is new");
            }
            case PROCESSING -> {
            }
            case SHIPPED -> {
                System.out.println("Order " + order.id + " is shipped to " + order.address);
            }
            case DELIVERED -> {
                System.out.println("Order " + order.id + " is delivered to " + order.address);
            }
            case CANCELLED -> {
            }
        }
    }

    public static void main(String[] args) {
        Order o1 = createOrder();
        Order o2 = createOrder();
        Order o3 = createOrder();

        o2.ship("Bangalore");

        printOrderStatus(o1);
        printOrderStatus(o2);
    }
}
