public class OrderDetail {
    public Car car;
    public int orderId;
    public int quantity;
    public int price;
    public String carName;
    public int carId;

    public OrderDetail(Car car, Order order, int quantity){
        super();
        this.carName = car.carName;
        this.carId = car.carId;
        this.orderId = order.orderId;
        this.quantity = quantity;
        this.price = car.price;
    }

    public void getReceiptByOrder(Order order, OrderDetail[] orderDetail){
        for (int i = 0; i < orderDetail.length; i++){
            if (order.orderId == orderDetail[i].orderId){
                System.out.println(orderDetail[i].toString());
            }
        }
    }

    @Override
    public String toString(){
        return   "Car ID: " + this.carId + "\n"
                + "Car Name: " + this.carName+ "\n"
                + "Quantity: " + this.quantity + "\n"
                + "Price: " + this.price;

    }

}
