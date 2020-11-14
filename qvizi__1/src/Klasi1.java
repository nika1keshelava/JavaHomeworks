import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Klasi1 {
    DecimalFormat df = new DecimalFormat("#.##");
    public double[] masivi = new double[60];

    public double gamotvla1(double i){
        return i*i + 3*i;
    }

    public double gamotvla2(double i){
        return 3*i*i*i - 5;
    }


    public void shetana(){
        double x = -5;
        for(int j = 0; j<60; j++){
                masivi[j] = gamotvla1(x);
                x += 0.1;
        }
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
        for (double element:masivi
             ) {
            String shedegi = String.valueOf(element);
            System.out.println(shedegi);
            failis_sheqmna(shedegi);
        }
    }
}
