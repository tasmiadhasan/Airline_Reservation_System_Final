import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Passenger {
    private String name;
    private String passport;
    private String address;
    private String phone;
    private int tickets;
    private String classtype;
    private int total_price;
    private String flightNumber;
    private String start;
    private String via;
    private String stop;
    private String startTime;
    private String stopTime;

    public Passenger() {
    }

    public void userInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("                                                 --------------------------------------------------------");
        System.out.println("                                                 To Reserve a Ticket you need to put the Information. .");
        System.out.println("                                                 --------------------------------------------------------");
        System.out.print("                                                 Enter your name: ");
        name = scan.next();
        System.out.print("                                                 Enter your Passport number: ");
        passport = scan.next();
        System.out.print("                                                 Enter your Phone number: ");
        phone = scan.next();
        System.out.print("                                                 Enter your Address: ");
        address = scan.next();
        System.out.print("                                                 Enter Quantity of tickets: ");
        tickets = scan.nextInt();
        scan.nextLine();
        System.out.println("                                                 Business Class Price: 50000 BDT");
        System.out.println("                                                 Economy Class Price: 30000 BDT");
        System.out.print("                                                 Enter class (Business/Economy): ");
        classtype = scan.next();
        int price;
        if (classtype.equals("Business")) {
            price = 50000;
            total_price = price * tickets;
        } else if (classtype.equals("Economy")) {
            price = 30000;
            total_price = price * tickets;
        } else {
            System.out.println();
            System.out.println("                                                 Wrong input");
        }

    }
    public void One_FlightCheck() {
        Scanner sc=new Scanner(System.in);
        System.out.print("                                                 Enter Your Desire Flight NO:");
        String flight_N=sc.next();
        try {
            File file = new File("One_Flights.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String flight_no = scanner.next();
                String from = scanner.next();
                String to = scanner.next();
                String ftime = scanner.next();
                String freach = scanner.next();
                if (flight_N.equals(flight_no)) {
                    flightNumber = flight_no;
                    start= from;
                    stop = to;
                    startTime = ftime;
                    stopTime = freach;
                    try{
                        File file1=new File("OneUser.txt");
                    FileWriter fw=new FileWriter(file1,true);
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
                    }catch (Exception e){
                        System.out.println("                                                 File not Found!");
                    }

                }
            }scanner.close();
        }catch(FileNotFoundException e){
            System.out.println();
            System.out.println("                                                 File not Found!");
        }
        System.out.println();
        System.out.println("                                                 Here is your invoice:"+"\n");
        System.out.println("                                                 -----------------AirLine: Bangladesh AirLine---------------------");
        System.out.println("                                                 -----------------------------------------------------------------");
        System.out.println("                                                 Flight No:"+flightNumber);
        System.out.println("                                                 ---------------------");
        System.out.println("                                                 From:"+start+"          "+"               To:"+stop);
        System.out.println("                                                 Departure:"+startTime+"      "+"         Arrival:"+stopTime);
        System.out.println("                                                 Name of Passenger: " + name + "       " + "Passport NO: " + passport);
        System.out.println("                                                 Phone NO: " + phone + "               " + "Address: " + address);
        System.out.println("                                                 Class: " + classtype);
        System.out.println("                                                 Tickets: " + tickets + "              " + "Price: " + total_price + "/=");
        System.out.println("                                                 -----------------------------------------------------------------");
        System.out.println("                                                 -----------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("                                                 This is your Booking. Please keep it safe.");
        System.out.println();
        System.out.println("                                                 Thank you for choosing us.");
        System.out.println();
        System.out.println("                                                 For Main-Menu press 1");
        System.out.println("                                                 For Exit press 2");
        System.out.println("                                                 For Cancel Ticket press 3" + "\n");
        System.out.println();
        System.out.print("                                                 Enter your choice:");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println();
            UserSign userSign=new UserSign();
            userSign.menu();
        } else if (choice == 2) {
            System.out.println("                                                 Thank You For Using our AirLine.");
            System.out.println();
            System.exit(0);
        } else if (choice == 3) {
            System.out.println();
            CancelFlight cancelFlight=new CancelFlight(flightNumber,start,stop,startTime,stopTime);
            cancelFlight.One_Cancel();
        }
    }
    public void Round_FlightCheck() {
        Scanner sc=new Scanner(System.in);
        System.out.print("                                                 Enter Your Desire Flight NO:");
        String flight_N=sc.next();
        try {
            File file = new File("Round_Flights.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String flight_no = scanner.next();
                String st = scanner.next();
                String vi = scanner.next();
                String sp = scanner.next();
                String start_time = scanner.next();
                String stop_time = scanner.next();
                if (flight_N.equals(flight_no)) {
                    flightNumber = flight_no;
                    start= st;
                    via=vi;
                    stop = sp;
                    startTime = start_time;
                    stopTime = stop_time;
                    try{
                        File file1=new File("RoundUser.txt");
                        FileWriter fw=new FileWriter(file1,true);
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
                    }catch (Exception e){
                        System.out.println("                                                 File not Found!");
                    }
                }
            }scanner.close();
        }catch(FileNotFoundException e){
            System.out.println("                                                 File not Found!");
        }
        System.out.println();
        System.out.println("                                                 Here is your invoice:"+"\n");
        System.out.println("                                                 -----------------AirLine: Bangladesh AirLine---------------------");
        System.out.println("                                                 -----------------------------------------------------------------");
        System.out.println("                                                 Flight No:"+flightNumber);
        System.out.println("                                                 ---------------------");
        System.out.println("                                                 From:"+start+"          "+"    Via:"+via+"       To:"+stop);
        System.out.println("                                                 Departure:"+startTime+"      "+"         Arrival:"+stopTime);
        System.out.println("                                                 Name of Passenger: " + name + "       " + "Passport NO: " + passport);
        System.out.println("                                                 Phone NO: " + phone + "               " + "Address: " + address);
        System.out.println("                                                 Class: " + classtype);
        System.out.println("                                                 Tickets: " + tickets + "              " + "Price: " + total_price + "/=");
        System.out.println("                                                 -----------------------------------------------------------------");
        System.out.println("                                                 -----------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("                                                 This is your Booking. Please keep it safe.");
        System.out.println();
        System.out.println("                                                 Thank you for choosing us.");
        System.out.println();
        System.out.println("                                                 For Main-Menu press 1");
        System.out.println("                                                 For Exit press 2");
        System.out.println("                                                 For Cancel Ticket press 3" + "\n");
        System.out.print("                                                 Enter your choice:");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println();
            UserSign userSign=new UserSign();
            userSign.menu();
        } else if (choice == 2) {
            System.out.println("                                                 Thank You For Using our AirLine.");
            System.out.println();
            System.exit(0);
        } else if (choice == 3) {
            System.out.println();
            CancelFlight cancelFlight=new CancelFlight(flightNumber,start,via,stop,startTime,stopTime);
            cancelFlight.Round_Cancel();
            System.exit(0);

        }
    }

}

