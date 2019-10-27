package p16.sdaonlineshop.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.Date;

public class Orders {

    private Date date;
    @Id
    @GeneratedValue(generator = "productId")
    @SequenceGenerator(name = "productId", sequenceName = "productId", allocationSize = 1)
    private int orderID;

    private int quantity;
    private String status;
    private boolean invoice;

    public Orders() {
    }

    private String orderStatusCheck() {
        return String.valueOf(OrderStatus.NOT_PAYED);
    }

    public void addOrder(Date date, int quantity) {
        this.date = date;
        this.quantity = quantity;
        this.status = String.valueOf(OrderStatus.NOT_PAYED);
        this.invoice = true;
    }

    public void removeOrder(int orderID) {
        this.status = String.valueOf(OrderStatus.CANCEL);
    }

    public int getOrderID() {
        return orderID;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
