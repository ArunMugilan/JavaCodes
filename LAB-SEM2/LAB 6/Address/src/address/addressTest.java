/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

/**
 *
 * @author Shalini
 */
import java.util.Scanner;
public class addressTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ExtPerson ExP = new ExtPerson();
        Person per = new Person();

        String book[] = new String[2];
        String Last[] = {"", ""};
        String Cato[] = {"", ""};
        int input;
      do{
        //Choose User
        System.out.println("=======================================================");
        System.out.println("1.Store Data");
        System.out.println("2.List All");
        System.out.println("3.Search");
        System.out.println("4.Exit");
        System.out.print("Choose One: ");
        input = in.nextInt();
        

        if (input == 1) {
            //Categorize
            System.out.println("        ====================          ");
            System.out.println("1.Family Member");
            System.out.println("2.Friend ");
            System.out.println("3.Business Associate ");
            System.out.print("Choose Category? ");
            int chose = in.nextInt();
            System.out.println("        ====================          ");

            for (int i = 0; i < 2; i++) {

                if (i == 0) {
                    Family my = new Family("Ahmad", "Kumal", 1, 2, 2002, "Jalan Ahmad 1", "Kuantan", "Pahang", 2520, "", "013");
                    book[i] = my.Display();
                    Last[i] = "Kumal";
                    Cato[i] = "Family Member";
                } else if (i == 1) {
                    Friends my = new Friends("Jahmad", "Kamal", 1, 2, 2002, "Jalan Ahmad 1", "Kuantan", "Pahang", 2520, "", "013");
                    book[i] = my.Display();
                    Last[i] = "Kamal";
                    Cato[i] = "Friend";
                } else {
                    Business my = new Business("Ahmad", "kamal", 1, 2, 2002, "Jalan Ahmad 1", "Kuantan", "Pahang", 2520, "", "013");
                    // my.Display();
                }
            }

            for (int i = 0; i < 2; i++) {
                for (int j = i + 1; j < 2; j++) {
                    if (Last[j].compareTo(Last[i]) < 0) {

                        String temp = Last[i];
                        Last[i] = Last[j];
                        Last[j] = temp;

                        String temp2 = book[j];
                        book[j] = book[i];
                        book[i] = temp2;
                    }
                }
            }
            
        } else if (input == 2) {
            System.out.println("        ====================          ");
            //Display
            for (int i = 0; i < 2; i++) {

                System.out.println(book[i]);
                System.out.println("");
            }
        } else if (input == 3) {
            //Search Last Name
            System.out.print("Search by Last Name : ");
            String user = in.next();

            for (int i = 0; i < 2; i++) {
                if (user.equals(Last[i])) {
                    System.out.println(book[i]);
                }
            }
            System.out.println("        ====================          ");
            System.out.println("\n1.Family Member");
            System.out.println("2.Friend ");
            System.out.println("3.Business Associate ");
            System.out.print("Search by Category : ");
            int user2 = in.nextInt();

            switch (user2) {
                case 0:
                    for (int i = 0; i < 2; i++) {
                        if ("Family Member".equals(Cato[i])) {
                            System.out.println(book[i]);
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 2; i++) {
                        if ("Friend".equals(Cato[i])) {
                            System.out.println(book[i]);
                        }
                    }
                    break;
                case 2:
                    break;
            }

        }
      }while (input != 4);
          
      
    }
}
