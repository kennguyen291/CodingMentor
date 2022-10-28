package dataSource;

import entity.*;

public class DataSource {
    public static BookType[] bookTypes = {
            new BookType(1, "Programming"),
            new BookType(1, "Fiction"),
            new BookType(1, "History"),
    };
    public static Book[] books = {
            new Book(1, "Tam Quoc Dien Nghia", "1234567891541", "La Quan Trung",3, 1),
            new Book(2, "Harry Porter", "1234567891542", "JK Rowling",2, 2),
            new Book(3, "JavaScript For Dummies", "1234567891543", "Dung Bui",1, 3),
    };

    public static Location[] locations = {
            new Location(1, "Shelf-A"),
            new Location(2, "Shelf-B"),
            new Location(3, "StoreRoom"),
    };

    public static Stock[] stocks = {
            new Stock(1, 1, 1),

            new Stock(2, 1, 1),
            new Stock(2, 3, 1),

            new Stock(3, 2, 1),

    };

    public static Customer[] customers = {
            new Customer(1, "Jayden", "Tran"),
            new Customer(2, "Tony", "Teo"),
    };

    public static Ticket[] tickets = {
            new Ticket(1, 1, 1, "01-10-2022", "30-10-2022"),
            new Ticket(2, 2, 2, "02-10-2022", "31-10-2022"),
            new Ticket(3, 2, 3, "03-10-2022", "01-11-2022"),
    };

    public static void main(){
      tickets[0].setReturnDate("20-10-2022");
    };



}
