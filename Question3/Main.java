
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        int len=s.length();

        for(int i=(len-1);i>=0;i--){

            System.out.print(s.charAt(i));
        }
    }
}
