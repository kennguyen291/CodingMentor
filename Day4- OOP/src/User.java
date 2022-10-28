public class User {
    public static int count = 0;
    String username;
    String password;
    String fullName;


    public User(){
        super();
        count ++;
    }
    public User(String username, String password, String fullName){
        super();
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        count ++;
    }

}
