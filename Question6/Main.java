
import java.util.Scanner;
public class Main {


    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int f=5;


        for(int i=f;i>=1;i--)
        {
            for(int j=f;j>=1;j--)
            {
                System.out.print(i>j?i:j);
            }
            System.out.println();
        }


    }
}