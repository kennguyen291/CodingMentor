import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Type type1 = new Type(1,"sedan" );
        Type type2 = new Type(2,"van" );
        Type type3 = new Type(3,"four wheel" );

        Brand brand1 = new Brand(1, "Toyota");
        Brand brand2 = new Brand(2, "Mercedes");
        Brand brand3 = new Brand(3, "Honda");

        Warehouse warehouse1 = new Warehouse(1, "An Suong", "Saigon");
        Warehouse warehouse2 = new Warehouse(1, "Strathfield", "Sydney");
        Warehouse warehouse3 = new Warehouse(1, "Ho Guom", "Hanoi");

        Car car1 = new Car(1, "Camry", type1, 20, 100, brand1);
        Car car2 = new Car(2, "V Class", type2, 70, 50, brand2);
        Car car3 = new Car(3, "Canh En", type3, 50, 200, brand3);

        Stock stock1 = new Stock(warehouse1, car1, 70);
        Stock stock2 = new Stock(warehouse2, car1, 30);
        Stock stock3 = new Stock(warehouse1, car2, 20);
        Stock stock4 = new Stock(warehouse2, car2, 10);
        Stock stock5 = new Stock(warehouse3, car3, 20);
        Stock stock6 = new Stock(warehouse3, car3, 200);


        Customer[] customerList = new Customer[3];
        customerList[0] = new Customer(1, "Khang", "Sydney");
        customerList[1] = new Customer(2, "Minh", "Melbourne");
        customerList[2] = new Customer(3, "Dung", "saigon");


        Order[] orderList = new Order[3];
        orderList[0] = new Order(1, customerList[0], "Progressing", LocalDate.of( 2026 , 10 , 15 ), 90 );
        orderList[1]  = new Order(2, customerList[1], "Received", LocalDate.of( 2026 , 10 , 17 ), 50 );
        orderList[2] = new Order(3, customerList[2], "Shipping", LocalDate.of( 2026 , 10 , 14 ), 70 );



        OrderDetail[] orderDetailList = new OrderDetail[5];
        orderDetailList[0] = new OrderDetail(car1, orderList[0], 2);
        orderDetailList[1] = new OrderDetail(car2, orderList[0], 1);
        orderDetailList[2] = new OrderDetail(car2, orderList[1], 1);
        orderDetailList[3]= new OrderDetail(car3, orderList[2], 3);
        orderDetailList[4]= new OrderDetail(car1, orderList[2], 3);

        System.out.println(orderList[0]);
//        getOrder(1, customerList, orderDetailList, orderList);

    }

    public static String getOrder(int orderId, Customer[] customerList, OrderDetail[] orderDetailList, Order[] orderList){
        int customerId = 0;

        for (int i = 0; i< orderList.length; i++){
            if (orderId == orderList[i].orderId){
                customerId = orderList[i].customerId;
            }
        }

        return "Order ID: " + orderId + "\n"
                + "Customer ID: " + customerId + "\n"
                + "Customer name: " + customerList[customerId - 1].customerName;
    }
}