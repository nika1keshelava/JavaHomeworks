import java.util.Scanner;

public class nika_keshelava_homework1 {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("which homework are you going to check?: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Homework_1_1.DoWork();
                    break;
                case 2:
                    Homework_1_2.DoWork();
                    break;
                case 3:
                    Homework_1_3.DoWork();
                    break;
                case 4:
                    Homework_1_4.DoWork();
                    break;
                case 5:
                    Homework_1_5.DoWork();
                    break;
                case 6:
                    System.out.println("not found");
                    break;
                case 7:
                    Homework_1_7.DoWork();
                    break;
                case 8:
                    Homework_1_8.DoWork();
                    break;
                case 9:
                    Homework_1_9.DoWork();
                    break;
            }
    }

}
