public class Car {
    public int carId;
    public String carName;
    public Type type;
    public int price;
    public int quantity;
    public Brand brand;
    public Car(int carId, String carName, Type type, int price, int quantity, Brand brand){
        super();
        this.carId = carId;
        this.carName = carName;
        this.type= type;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
    }
    public Car(){
        super();
    }

    @Override
    public String toString(){
        return
                "Car ID: " + this.carId + "\n"
                + "Name: " + this.carName + "\n"
                + "Type: " + this.type + "\n"
                + "Price: " + this.price + "\n"
                        + "Quantity: " + this.quantity + "\n"
                        + "Brand: " + this.brand.brandName + "\n";
    }
}
