
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double a=scan.nextFloat();
        if(a<500){
            System.out.format("%.2f",a);
        } else if ((a>=500)&&(a<1000)) {
            double d=a-(a*0.1);
            System.out.format("%.2f",d);
        }
        else{
            double d=a-(a*0.2);
            System.out.format("%.2f",d);
        }

    }
}
