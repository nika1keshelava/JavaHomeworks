import java.util.Scanner;

public class Homework_1_5 {
    public static void DoWork(){
        int m, n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        m = sc.nextInt();
        while (m>0){
            n = m % 10;
            sum = sum + n;
            m = m / 10;

        }
        System.out.println("sum: " + sum);
    }
}
