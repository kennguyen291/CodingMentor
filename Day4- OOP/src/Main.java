import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static User getUser(User[] userArr, String username, String password){
        // loop qua userArr

        // check xem co userArr[i] nao == username ko
        //      ko: thi sout "user ko ton tai"
        //      yes: thi moi check tiep userArr[i] == password ko
        //              yes thi grant access
        //              no thi nhap lai password
        User currentUser;

        for (int i = 0; i < userArr.length ; i++) {
            if (Objects.equals(userArr[i].username, username)){
                break;
            } else {
                currentUser = null;
                return currentUser;
            }


        }

        return null;
    }
    public static void main(String[] args) {
        User user001 = new User("ms01", "abc01", "Michael Scott");
        User user002 = new User("ph02", "abc02", "Pam Halpert");
        User user003 = new User("rh03", "abc03", "Ryan Howard");
        User[] userList = {user001, user002, user003};

        Ticket ticket01 = new Ticket("01", "User Story", "Ready for development");
        Ticket ticket02 = new Ticket("02", "Task", "In Development");
        Ticket ticket03 = new Ticket("03", "Bug", "Done");

        Scanner input = new Scanner(System.in);
        String inputUsername;
        String inputPassword;
        String currentUserPassword = "";
        String inputTicket;
        Ticket ticketPicked = new Ticket();
        User currentUser = new User();

        Ticket[] ticketList = {ticket01, ticket02, ticket03};

        do {
            System.out.println("Enter your username: ");
            inputUsername = input.nextLine();
            System.out.println("Enter your password: ");
            inputPassword= input.nextLine();

            currentUser = getUser(userList, inputUsername, inputPassword);

            System.out.println(currentUser);

            if (currentUser !=null){
                break;
            }
            System.out.println("your username or password is invalid");
        } while (true);



        //getUser() return user hoac null

        // neu co user thi moi show cai ticketList



//        //----------------------- XET USERNAME
//        do {
//            boolean usernameFound = false;
//            System.out.println("Enter your username: ");
//            inputUsername = input.nextLine();
//
//            for (int i = 0; i < userList.length; i++){
//                if (Objects.equals(inputUsername, userList[i].username)){
//                    usernameFound = true;
//                    currentUserPassword = userList[i].password;
//                }
//            }
//            if (usernameFound){
//                break;
//            }
//            System.out.println("This username is not existed");
//        } while (true);
//        //-----------------------------------XET PASSWORD
//        do {
//            System.out.println("Enter your password: ");
//            inputPassword= input.nextLine();
//
//            if (Objects.equals(inputPassword, currentUserPassword)){
//                break;
//            }
//
//            System.out.println("Wrong password");
//        } while (true);
//
//        for (int i = 0; i < ticketList.length; i++) {
//            System.out.println(ticketList[i] + "\n");
//        }


        //-------------------------------PICK TICKET
//        do {
//            boolean isTicketExist = false;
//            System.out.println("Enter ID of the ticket you want to pick: ");
//            inputTicket = input.nextLine();
//
//            for (int i = 0; i < ticketList.length; i++) {
//                if (Objects.equals(inputTicket, ticketList[i].id)) {
//                    isTicketExist = true;
//                    ticketPicked = ticketList[i];
//                }
//
//            }
//            if (isTicketExist){
//                break;
//            }
//            System.out.println("This ticket is not exist");
//        } while (true);
//
//        System.out.println("YOU HAVE PICKED TICKET: " + "\n" + ticketPicked);
    }
}


