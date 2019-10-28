package p16.sdaonlineshop.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.time.LocalDate;


public class Orders {

    private LocalDate date;
    @Id
    @GeneratedValue(generator = "productId")
    @SequenceGenerator(name = "productId", sequenceName = "productId", allocationSize = 1)
    private int orderID;

    private int quantity;
    private String status;
    private boolean invoice;

    private String city;
    private String street;
    private String streetNumber;
    private String postCode;

    public Orders() {
    }

    private String orderStatusCheck() {
        return String.valueOf(OrderStatus.NOT_PAYED);
    }

    public void addOrder(LocalDate date, int quantity) {
        this.date = date;
        this.quantity = quantity;
        this.status = String.valueOf(OrderStatus.NOT_PAYED);
        this.invoice = true;
    }

    public void removeOrder(int orderID) {
        this.status = String.valueOf(OrderStatus.CANCEL);
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }


    public int getOrderID() {
        return orderID;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalDate setDate() {
        return this.date = LocalDate.now();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = orderStatusCheck();
    }

    public boolean isInvoice() {
        return invoice;
    }

    public void setInvoice(boolean invoice) {
        this.invoice = invoice;
    }
}
