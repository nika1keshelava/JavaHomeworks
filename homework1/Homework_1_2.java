import java.util.Scanner;

public class Homework_1_2 {
    public static void DoWork(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first num: ");
        int num1 = sc.nextInt();
        System.out.print("enter the second num: ");
        int num2 = sc.nextInt();
        if (num1==0 || num2==0){

            System.out.print("ERROR is not divisible because" );

            if (num1==0){
                System.out.print(" num1 = 0");
            }
            else {
                System.out.print(" num2 = 0");
            }
        }
        else {
            System.out.println(num1 / num2);
            System.out.println(num2 % num1);
        }
    }
}
