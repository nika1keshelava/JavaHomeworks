import java.io.*;
import java.util.Collections;
import java.util.List;


public class Klasi2 {
    public double[] masivi = new double[100];
    public double[] dadebitebis_masivi = new double[100];
    public double[] shualedebis_masivi = new double[100];



    File filereader = new File("results.txt");

    BufferedReader bufferedReader = new BufferedReader(new FileReader(filereader));

    public Klasi2() throws FileNotFoundException {
    }


    public double[] chawera() throws IOException {
        String st;
        int i = 0;
        while ((st = bufferedReader.readLine()) != null)

        {
            masivi[i] = Double.parseDouble(st);
            i+=1;
        }
        return masivi;

    }
    public double[] mxolod_dadebitebi(){
        int i = 0;
        for (double element:masivi
             ) {
            if(element>0){
                dadebitebis_masivi[i] = element;
                i += 1;
            }
        }
        return dadebitebis_masivi;
    }

    public double[] shualedebi(){
        int i = 0;
        for (double element:masivi
             ) {
            if(element>-1 & element<1){
                shualedebis_masivi[i] = element;
                i += 1;
            }
        }
        return shualedebis_masivi;
    }
    
    public void min_max(List<Double> dadebitebis_masivi ){
         System.out.println(Collections.min(dadebitebis_masivi));
         System.out.println(Collections.max(dadebitebis_masivi));
    }

    public void sashualo(){
        int jami = 0;
        int raodenoba = shualedebis_masivi.length;

        for (double element: masivi
             ) {
            jami+=element;

        }
        System.out.println("sashualo: " + jami/raodenoba);
    }

}
