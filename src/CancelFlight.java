import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CancelFlight extends Flights{
    private String flightNumber;
    private String start;
    private String via;
    private String stop;
    private String startTime;
    private String stopTime;

    public CancelFlight() {
    }

    public CancelFlight(String flightNumber, String start, String stop, String startTime, String stopTime) {
        this.flightNumber = flightNumber;
        this.start = start;
        this.stop = stop;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    public CancelFlight(String flightNumber, String start, String via, String stop, String startTime, String stopTime) {
        this.flightNumber = flightNumber;
        this.start = start;
        this.via = via;
        this.stop = stop;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    public void One_Cancel(){
        try{
            File file=new File("OneUser.txt");
            FileWriter fw=new FileWriter(file,true);
            fw.write(flightNumber);
            fw.write(" ");
            fw.write(start);
            fw.write(" ");
            fw.write(stop);
            fw.write(" ");
            fw.write(startTime);
            fw.write(" ");
            fw.write(stopTime);
            fw.write("\n");
            fw.close();
            System.out.println("                                           Your available flights are: ");
            System.out.println("                                           Flight No:" + flightNumber + "   Flying From:" + start + "   Flying to:" + stop + "\n" + "                                           Date & Time:" + startTime + "    Arrival:" + stopTime + "\n");
            System.out.println("                                           Are you sure you want to cancel this flight? (Y/N):");
            Scanner sc=new Scanner(System.in);
            String N=sc.next();
            if(N.equals("Y")){
                System.out.println("                                           Your flight has been cancelled successfully.");
                System.out.println("                                           Thank you for using our AirLine.");
                System.out.println("For Main-Menu press 1!");
                System.out.println("For Exit press 2!");
                System.out.print("Enter your choice:");
                Scanner scanner=new Scanner(System.in);
                int choice=scanner.nextInt();
                if(choice==1){
                    UserSign menu=new UserSign();
                    menu.menu();
                }
                else{
                    System.out.println("Thank you for using our AirLine.");
                    System.exit(0);
                }

                System.exit(0);
            }
            else{
                fw.close();
                System.out.println("                                           Your flight has not been cancelled.");
                System.out.println("                                           Thank you for using our AirLine.");
                System.exit(0);
            }


        }catch (IOException e){
            System.out.println(e);
        }
    }
    public void Round_Cancel(){
        try{
            File file=new File("RoundUser.txt");
            FileWriter fw=new FileWriter(file,true);
            fw.write(flightNumber);
            fw.write(" ");
            fw.write(start);
            fw.write(" ");
            fw.write(via);
            fw.write(" ");
            fw.write(stop);
            fw.write(" ");
            fw.write(startTime);
            fw.write(" ");
            fw.write(stopTime);
            fw.write("\n");
            fw.close();
            System.out.println("                                           Your available flights are: ");
            System.out.println("                                           No:" + flightNumber + "     Flying From:" + start + "      Via:" + via + "      Flying to:" + stop + "\n" + "                                           Date & Time:" + startTime + "        Arrival:" + stopTime + "\n");
            System.out.print("                                           Are you sure you want to cancel this flight? (Y/N):");
            Scanner sc=new Scanner(System.in);
            String N=sc.next();
            if(N.equals("Y")){
                file.delete();
                System.out.println("                                           Your flight has been cancelled successfully.");
                System.out.println("                                           Thank you for using our AirLine.");
                System.exit(0);
            }
            else{
                System.out.println("                                           Your flight has not been cancelled.");
                System.out.println("                                           Thank you for using our AirLine.");
                System.exit(0);
            }

        }catch (IOException e){
            System.out.println(e);
        }
    }
    public void cancel(){
        Scanner sc=new Scanner(System.in);
        System.out.println("                                                 Choose which flight you want to cancel: ");
        System.out.println("                                                 1. One Way Flight");
        System.out.println("                                                 2. Round Trip Flight");
        System.out.println("                                                 3. Main Menu");
        System.out.println("                                                 4. Exit");
        System.out.print("                                                 Enter your choice: ");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("");
                oneW();
                break;
            case 2:
                System.out.println("");
                RW();
                break;
            case 3:
                System.out.println("");
                UserSign menu=new UserSign();
                menu.menu();
                break;
            case 4:
                System.out.println("");
                System.out.println("                                           Thank You For Using our AirLine.");
                System.exit(0);
                break;
            default:
                System.out.println("                                           Invalid Input");
                System.exit(0);
        }
    }
    public void oneW(){
        System.out.println("                                           Your available flights are: ");
        try {
            File file = new File("OneUser.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String flight_num = scanner.next();
                String start = scanner.next();
                String stop = scanner.next();
                String start_time = scanner.next();
                String stop_time = scanner.next();
                Flights flight = new Flights(flight_num, start, stop, start_time, stop_time);
                flight.one();
                System.out.print("                                           Are you sure you want to cancel this flight? (Y/N):");
                Scanner sc=new Scanner(System.in);
                String N=sc.next();
                if(N.equals("Y")){
                    file.delete();
                    System.out.println("                                           Your flight has been cancelled successfully.");
                    System.exit(0);
                }
                else{
                    System.out.println("                                           Your flight has not been cancelled.");
                    System.out.println("                                           Thank you for using our AirLine.");
                    System.exit(0);
                }
            }scanner.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }

    }
    public void RW(){
        System.out.println("                                           Your available flights are: ");
        try {
            File file = new File("RoundUser.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String flight_num = scanner.next();
                String start = scanner.next();
                String via = scanner.next();
                String stop = scanner.next();
                String start_time = scanner.next();
                String stop_time = scanner.next();
                Flights flight = new Flights(flight_num, start, via, stop, start_time, stop_time);
                flight.round();
                System.out.print("                                           Are you sure you want to cancel this flight? (Y/N):");
                Scanner sc=new Scanner(System.in);
                String N=sc.next();
                if(N.equals("Y")){
                    file.delete();
                    System.out.println("                                           Your flight has been cancelled successfully.");
                    System.exit(0);
                }
                else{
                    System.out.println("                                           Your flight has not been cancelled.");
                    System.out.println("                                           Thank you for using our AirLine.");
                    System.exit(0);
                }
            }scanner.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }

}
