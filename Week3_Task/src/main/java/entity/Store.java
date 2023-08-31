package entity;

import java.util.Queue;
import java.util.Map;
import java.util.LinkedList;

public class Store {
    private Map<Product, Integer> inventory;
    private Queue<Customer> customerQueue;

    public Map<Product, Integer> getInventory() {
        return inventory;
    }

    public void setInventory(Map<Product, Integer> inventory) {
        this.inventory = inventory;
    }

    public Queue<Customer> getCustomerQueue() {
        return customerQueue;
    }

    public void setCustomerQueue(Queue<Customer> customerQueue) {
        this.customerQueue = customerQueue;
    }

    @Override
    public String toString() {
        return "Store{" +
                "inventory=" + inventory +
                ", customerQueue=" + customerQueue +
                '}';
    }

    public Store(Map<Product, Integer> inventory, Queue<Customer> customerQueue) {
        this.inventory = inventory;
        this.customerQueue = customerQueue;

    }
}
