import java.util.Scanner;

public class Homework_1_3 {
    public static void DoWork(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first num");
        int num1 = sc.nextInt();
        System.out.print("enter the second num");
        int num2 = sc.nextInt();
        System.out.print("enter the third num");
        int num3 = sc.nextInt();

        System.out.println(num1*num2*num3);
        System.out.println(num1+num2+num3);

    }
}

