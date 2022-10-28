public class Stock {
    public Warehouse warehouse;
    public Car car;
    public int quantity;

    public Stock(){
        super();
    }
    public Stock(Warehouse warehouse, Car car, int quantity){
        this.warehouse = warehouse;
        this.car = car;
        this.quantity = quantity;
    }
}
