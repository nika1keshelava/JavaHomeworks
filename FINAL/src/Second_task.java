import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Second_task {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> digits = new ArrayList<>();

    public void dashla() {
        System.out.println("num?: ");
        int num = sc.nextInt();


        do {
            digits.add(num % 10);
            num /= 10;
        } while (num > 0);
        System.out.println("digits: " + digits);
        String result = String.valueOf(digits);
    }

    public  void failis_sheqmna(String s){
        try{
            FileWriter fileWriter = new FileWriter("text.txt",true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.write(s);
            printWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public void failshi_chawera(){
        for (int element:digits
        ) {
            String shedegi = String.valueOf(element);
            System.out.println(shedegi);
            failis_sheqmna(shedegi);
        }
    }
}
