import java.util.Scanner;

public class Homework_1_8 {
    public static void DoWork(){
        int m , n;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("m?: ");
        m = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("n?: ");
        n = sc2.nextInt();

        for(int i = 0; i<= n-m; i=i+1 ){
            System.out.print(m+i);
        }
    }
}
