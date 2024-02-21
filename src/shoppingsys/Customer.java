/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingsys;

/**
 *
 * @author User
 */
public class Customer implements DiscountRate {
    private String customerName;
    private String customerType;

    public Customer(String customerName, String customerType) {
        this.customerName = customerName;
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public double getServiceMemberDiscount() {
        switch (customerType) {
            case "Premium":
                return 0.20; // 20% discount
            case "Gold":
                return 0.15; // 15% discount
            case "Silver":
                return 0.10; // 10% discount
            default:
                return 0.0; // 0% discount
        }
    }

    @Override
    public double getProductMemberDiscount() {
        switch (customerType) {
            case "Premium":
            case "Gold":
            case "Silver":
                return 0.10; // 10% discount for Premium, Gold, and Silver
            default:
                return 0.0; // 0% discount
        }
    }
}
