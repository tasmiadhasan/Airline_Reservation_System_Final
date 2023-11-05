import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Flights {
    private String flightNumber;
    private String start;
    private String via;
    private String stop;
    private String startTime;
    private String stopTime;
   public Flights() {
    }
    Flights(String flightNumber, String start, String stop, String startTime, String stopTime) {
        this.flightNumber = flightNumber;
        this.start = start;
        this.stop = stop;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    Flights(String flightNumber, String start, String via, String stop, String startTime, String stopTime) {
        this.flightNumber = flightNumber;
        this.start = start;
        this.via = via;
        this.stop = stop;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }
    public void one() {
        System.out.println("                                                 --------------------------------------------------------");
       System.out.print("                                                 Flight No:" + flightNumber + "   Flying From:" + start + "   Flying to:" + stop + "\n" + "                                                 Date & Time:" + startTime + "    Arrival:" + stopTime + "\n");
   }

    public void round() {
        System.out.println("                                                 -------------------------------------------------------------------");
        System.out.print("                                                 No:" + flightNumber + "     Flying From:" + start + "      Via:" + via + "      Flying to:" + stop + "\n" + "                                                 Date & Time:" + startTime + "        Arrival:" + stopTime + "\n");
   }
    Passenger passenger=new Passenger();

    public void Dhaka_Tokyo() {
        try {
            File file = new File("dhaka_to_tokyo.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String flight_num = scanner.next();
                String start = scanner.next();
                String stop = scanner.next();
                String start_time = scanner.next();
                String stop_time = scanner.next();
                Flights flight = new Flights(flight_num, start, stop, start_time, stop_time);
                flight.one();
            }scanner.close();
        }catch(FileNotFoundException e){
            System.out.println();
            System.out.println("                                                 File not Found!");
        }

        passenger.userInfo();
        passenger.One_FlightCheck();
    }
    public void Dhaka_London() {
        try {
            File file = new File("dhaka_to_london.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String flight_num = scanner.next();
                String start = scanner.next();
                String stop = scanner.next();
                String start_time = scanner.next();
                String stop_time = scanner.next();
                Flights flight = new Flights(flight_num, start, stop, start_time, stop_time);
                flight.one();
            }scanner.close();
        }catch(FileNotFoundException e){
            System.out.println();
            System.out.println("                                                 File not Found!");
        }
        passenger.userInfo();
        passenger.One_FlightCheck();
    }
    public void Dhaka_German(){
        try {
            File file = new File("dhaka_to_german.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String flight_num = scanner.next();
                String start = scanner.next();
                String stop = scanner.next();
                String start_time = scanner.next();
                String stop_time = scanner.next();
                Flights flight = new Flights(flight_num, start, stop, start_time, stop_time);
                flight.one();
            }scanner.close();
        }catch(FileNotFoundException e){
            System.out.println();
            System.out.println("                                                 File not Found!");
        }
        passenger.userInfo();
        passenger.One_FlightCheck();
    }
    public void Dhaka_Australia(){
        try {
            File file = new File("dhaka_to_australia.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String flight_num = scanner.next();
                String start = scanner.next();
                String stop = scanner.next();
                String start_time = scanner.next();
                String stop_time = scanner.next();
                Flights flight = new Flights(flight_num, start, stop, start_time, stop_time);
                flight.one();
            }scanner.close();
        }catch(FileNotFoundException e){
            System.out.println();
            System.out.println("                                                 File not Found!");
        }
        passenger.userInfo();
        passenger.One_FlightCheck();
    }
    public void Dhaka_Dubai(){
        try {
            File file = new File("dhaka_to_dubai.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String flight_num = scanner.next();
                String start = scanner.next();
                String stop = scanner.next();
                String start_time = scanner.next();
                String stop_time = scanner.next();
                Flights flight = new Flights(flight_num, start, stop, start_time, stop_time);
                flight.one();
            }scanner.close();
        }catch(FileNotFoundException e){
            System.out.println();
            System.out.println("                                                 File not Found!");
        }
        passenger.userInfo();
        passenger.One_FlightCheck();
    }
    public void Round_Dhaka_Tokyo(){
        try {
            File file = new File("round_dhaka_to_tokyo.txt");
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
            }scanner.close();
        }catch(FileNotFoundException e){
            System.out.println();
            System.out.println("                                                 File not Found!");
        }
        passenger.userInfo();
        passenger.Round_FlightCheck();
    }
    public void Round_Dhaka_London(){
        try {
            File file = new File("round_dhaka_to_london.txt");
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
            }scanner.close();
        }catch(FileNotFoundException e){
            System.out.println();
            System.out.println("                                                 File not Found!");
        }
        passenger.userInfo();
        passenger.Round_FlightCheck();
    }
    public void Round_Dhaka_German(){
        try {
            File file = new File("round_dhaka_to_german.txt");
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
            }scanner.close();
        }catch(FileNotFoundException e){
            System.out.println();
            System.out.println("                                                 File not Found!");
        }
        passenger.userInfo();
        passenger.Round_FlightCheck();
    }
    public void Round_Dhaka_Australia(){
        try {
            File file = new File("round_dhaka_to_australia.txt");
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
            }scanner.close();
        }catch(FileNotFoundException e){
            System.out.println();
            System.out.println("                                                 File not Found!");
        }
        passenger.userInfo();
        passenger.Round_FlightCheck();
    }
}
