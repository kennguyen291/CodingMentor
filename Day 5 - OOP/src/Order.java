import java.time.LocalDate;

public class Order {
    public int orderId;
    public int customerId;
    public String status;
    public LocalDate orderDate;
    public int totalPrice;

    public Order(int orderId, Customer customer, String status, LocalDate orderDate, int totalPrice){
        super();
        this.customerId = customer.customerId;
        this.status = status;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
    }

    @Override

    public String toString(){
        return "Oder ID: " + orderId + " " + customerId + " " + status + " " + orderDate + " " + totalPrice;
    }



}
