
import java.util.Scanner;
public class PosNegZero_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number ");
        int num = sc.nextInt();
        if(num == 0  )
        {
            System.out.println("The number is zero");
        }
        else if  (num < 0)
        {
            System.out.println("tHE number is negative");
            
        }
        else{
            System.out.println("The number is positive");
        }


    }
}
