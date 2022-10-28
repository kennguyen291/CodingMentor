package entity;

public class Location {
    private int id;
    private String name;
    private int stockId;

    public Location(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Location() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }
}
