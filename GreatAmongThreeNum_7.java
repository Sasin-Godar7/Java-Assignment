import java.util.Scanner;
public class GreatAmongThreeNum_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int x = sc.nextInt();

        System.out.println("Enter the second number ");
        int y = sc.nextInt();

        System.out.println("Enter the third number");
        int z = sc.nextInt();

        if(x > y && x >z)
        {
            System.out.println(x+ "is the greatest number");
        }
        else if (y>x && y >z)
        {
            System.out.println(y+ "is the greatest number");
        }
        else{
            System.out.println(z + "is the greatest number");
        }

    }
}
