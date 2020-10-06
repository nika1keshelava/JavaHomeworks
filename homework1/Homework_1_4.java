import java.util.Scanner;

public class Homework_1_4 {
    public static void DoWork(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        while (num>0){
            System.out.println(num%10);
            num = num/10;
        }

    }
}
