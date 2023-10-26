import java.util.Scanner;

public class Book_Flight extends Flights{

    public void book(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("                                           Reserve Your Flight"+"\n");
        System.out.println("                                           1.One Way Reservation");
        System.out.println("                                           2.Round-Trip");
        System.out.println("                                           3.Main-Menu");
        System.out.println("                                           4.Exit"+"\n");
        System.out.print("                                             Enter your choice:");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("");
                one();
                break;
            case 2:
                System.out.println("");
                Round();
                break;
            case 3:
                System.out.println("");
                UserSign menu=new UserSign();
                menu.menu();
                break;
            case 4:
                System.out.println("");
                System.out.println("                                            Thank You for Choosing Our AirLine");
                System.exit(0);
                break;
            default:
                System.out.println("                                           Invalid Input");
        }
    }
    public void one(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("                                           Our Available Trips are...."+"\n");
        System.out.println("                                           1.Dhaka To Tokyo");
        System.out.println("                                           2.Dhaka To London");
        System.out.println("                                           3.Dhaka To Munich");
        System.out.println("                                           4.Dhaka To Sydney");
        System.out.println("                                           5.Dhaka To Dubai");
        System.out.println("                                           6.Previous menu");
        System.out.println("                                           7.Main Menu");
        System.out.println("                                           8.Exit"+"\n");
        System.out.print("                                           Choose The Destination To see the flights:");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("");
                Dhaka_Tokyo();
                break;
            case 2:
                System.out.println("");
                Dhaka_London();
                break;
            case 3:
                System.out.println("");
                Dhaka_German();
                break;
            case 4:
                System.out.println("");
                Dhaka_Australia();
                break;
            case 5:
                System.out.println("");
                Dhaka_Dubai();
                break;
            case 6:
                System.out.println("");
                book();
                break;
            case 7:
                System.out.println("");
                UserSign menu=new UserSign();
                menu.menu();
                break;
            case 8:
                System.out.println("");
                System.out.println("                                           Thank you for using our AirLine.");
                System.exit(0);
                break;
            default:
                System.out.println("                                           Invalid Input");
        }
    }
    public void Round(){
        System.out.println("                                           Our Available Trips are...."+"\n");
        System.out.println("                                           1.Dhaka-Dubai-Tokyo");
        System.out.println("                                           2.Dhaka-Dubai-Sydney");
        System.out.println("                                           3.Dhaka-Dubai-Munich");
        System.out.println("                                           4.Dhaka-Dubai-London");
        System.out.println("                                           5.Previous Menu");
        System.out.println("                                           6.Main Menu");
        System.out.println("                                           7.Exit"+"\n");
        Scanner scanner=new Scanner(System.in);
        System.out.print("                                           Enter your choice:");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("");
                Round_Dhaka_Tokyo();
                break;
            case 2:
                System.out.println("");
                Round_Dhaka_Australia();
                break;
            case 3:
                System.out.println("");
                Round_Dhaka_German();
                break;
            case 4:
                System.out.println("");
                Round_Dhaka_London();
                break;
            case 5:
                System.out.println("");
                book();
                break;
            case 6:
                System.out.println("");
                UserSign menu=new UserSign();
                menu.menu();
                break;
            case 7:
                System.out.println("");
                System.out.println("                                           Thank you for using our AirLine.");
                System.exit(0);
                break;
            default:
                System.out.println("                                           Invalid Input");
        }
    }



}
