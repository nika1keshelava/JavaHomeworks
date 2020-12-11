import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Metodebi {
    ArrayList<Integer> arrayList = new ArrayList<>();

    public void gamotvla() {
        int counter = 0;
        int x = 9;
        for (int i = 10; i < 5000; i++) {
            x += 1;
            if (i % 7 == 0) {
                if (i % x == 0) {
                    counter += 1;
                }
                x += 1;
            }
            if (counter == 2) {
                arrayList.add(i);
                counter = 0; //gavanulot rata axlidan daiwyos magla cikli
            }
        }
        System.out.println(arrayList);
    }

    public  void failis_sheqmna(String s){
        try{
            FileWriter fileWriter = new FileWriter("results.txt",true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.write(s);
            printWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public void failshi_chawera(){
        for (int element:arrayList
        ) {
            String shedegi = String.valueOf(element);
            System.out.println(shedegi);
            failis_sheqmna(shedegi);
        }
    }



}

