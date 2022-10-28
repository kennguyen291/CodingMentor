package entity;

public class Stock {
    private int locationId;
    private int bookId;
    private int quantity;

    public Stock(int bookId, int locationId, int quantity) {
        super();
        this.locationId = locationId;
        this.bookId = bookId;
        this.quantity = quantity;
    }

    public Stock() {
        super();
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
