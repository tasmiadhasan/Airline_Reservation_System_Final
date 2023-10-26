import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserSign implements Login, SingUp,Menu {
    public void singUp() {
        Scanner scanner = new Scanner(System.in);
        try{
            File file = new File("login.txt");
            FileWriter fw = new FileWriter(file, true);
            System.out.print("                                           Enter your User-Name: ");
            String user_name = scanner.nextLine();
            fw.write(user_name);
            fw.write("\t");
            System.out.print("                                           Enter your Password: ");
            String password = scanner.nextLine();
            fw.write(password);
            fw.write("\n");
            System.out.println("");
            System.out.println("                                           Please remember your user_name and password."+"\n");
            fw.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
    @Override
    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("                                           USERNAME:");
        String name = sc.nextLine();
        System.out.print("                                           PASSWORD:");
        String pass = sc.nextLine();
        try{
            File file=new File("login.txt");
            Scanner scanner=new Scanner(file);
            boolean loginOK=false;
            while(scanner.hasNext()) {
                String user_name = scanner.next();
                String password = scanner.next();
                if (name.equals(user_name) && pass.equals(password)) {
                    loginOK=true;
                    break;
                }
            } scanner.close();
            if(loginOK){
                System.out.println("                                           ------------------Login Successful--------------------"+"\n");
                menu();
            }
            else{
                System.out.println("                                           Login Failed!!");
                System.out.println("                                           Try Again..........");
            }


        }catch (FileNotFoundException e){
            System.out.println(e);
        }

    }

    @Override
    public void menu() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("                                           Welcome to AirLine Reservation System"+"\n");
                System.out.println("                                           1.Book-Flight");
                System.out.println("                                           2.Cancel a Flight");
                System.out.println("                                           3.Exit"+'\n');
                System.out.print("                                            Your choice:");
                int choice=scanner.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("");
                        Book_Flight book_a_flight = new Book_Flight();
                        book_a_flight.book();
                        break;
                    case 2:
                        System.out.println("");
                        CancelFlight cancel = new CancelFlight();
                        cancel.cancel();
                        break;
                    case 3:
                        System.out.println("");
                        System.out.println("                                           Thank you for Choosing our AirLine.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("                                           Invalid Input");
                }
            }
        }
