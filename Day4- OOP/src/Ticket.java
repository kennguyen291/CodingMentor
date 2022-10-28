public class Ticket {
    public int count = 0;
    String username;
    String id;
    String type;
    String status;

    public Ticket(){
        super();
        count++;
    }

    public Ticket(String id, String type, String status){
        super();
        this.id = id;
        this.type = type;
        this.status = status;
        count++;
    }
    @Override

    public String toString(){
        return "Ticket id: " + this.id + "\n" + "Type: " + this.type + "\n" + "Status: " + this.status;
    }


}
