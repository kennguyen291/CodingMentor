package entity;

public class Book {
    private int id;
    private String name;
    private String isbn;
    private String author;
    private int quantity;
    private int bookTypeId;
    private int stockId;

    public Book() {
        super();
    }

    public Book(int id, String name, String isbn, String author, int bookTypeId, int quantity) {
        super();
        this.id = id;
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.quantity = quantity;
        this.bookTypeId = bookTypeId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getBookTypeId() {
        return bookTypeId;
    }

    public int getStockId() {
        return stockId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBookTypeId(int bookTypeId) {
        this.bookTypeId = bookTypeId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }
}
