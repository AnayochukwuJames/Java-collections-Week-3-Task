package entity;

import java.util.List;

public class Customer extends Person{
    private String customerID;
    private List<Product> itemToPurchase;

    public Customer(String fullName, String address, String email, String phoneNumber, int age, String customerID, List<Product> itemToPurchase) {
        super(fullName, address, email, phoneNumber, age);
        this.customerID = customerID;
        this.itemToPurchase = itemToPurchase;

    }
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public List<Product> getItemToPurchase() {
        return itemToPurchase;
    }

    public void setItemToPurchase(List<Product> itemToPurchase) {
        this.itemToPurchase = itemToPurchase;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", itemToPurchase=" + itemToPurchase +
                '}';
    }
}
