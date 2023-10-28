import java.util.Scanner;

public class DriverClass extends Welcome{
    public static void main(String[] args) {
        welcome();
        UserSign sign = new UserSign();
        System.out.print("                                                 Welcome to window......please follow the instructions");
        System.out.println();
        while(true){
            System.out.println("                                                 1. Sign Up");
            System.out.println("                                                 2. Login");
            System.out.println("                                                 3. Exit"+"\n");
            System.out.print("                                                 Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println();
                    sign.singUp();
                    break;
                case 2:
                    System.out.println();
                    sign.login();
                    break;
                case 3:
                    System.out.println("                                                 Thank you for using User AirLine Reservation System!");
                    System.exit(0);
                    break;
                default:
                    System.out.println();
                    System.out.println("                                                 !!Invalid Input");
                    System.out.println("                                                 Please Try Again!..........");

            }

        }



    }
}
