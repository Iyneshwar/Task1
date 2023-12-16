
import java.util.Scanner;
public class Main {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);


            int no = scan.nextInt();

            if (no > 0) {
                System.out.println("The number is positive");
            } else if (no < 0) {
                System.out.println("The number is negative");
            } else {
                System.out.println("The number is zero");
            }


        }
    }

