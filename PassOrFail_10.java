import java.util.Scanner;
public class PassOrFail_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of subject 1");
        int s1 = sc.nextInt();
        System.out.println("Enter the marks of subject 2");
        int s2 = sc.nextInt();
        System.out.println("Enter the marks of subject 3");
        int s3 = sc.nextInt();
        System.out.println("Enter the marks of subject 4");
        int s4 = sc.nextInt();
        System.out.println("Enter the marks of subject 5");
        int s5 = sc.nextInt();

        if(s1<40 || s2<40 || s3<40 || s4<40 || s5<40)
        {
            System.out.println("Sorry you are fail ");
            System.out.println("Try again");
        }
        else
        {
            System.out.println("Congratulations you are pass");
        }
    }
}
