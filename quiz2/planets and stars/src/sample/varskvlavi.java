package sample;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class varskvlavi {
    String name;
    int diameter, temperature;
    ArrayList<Planet> planet_list = new ArrayList<Planet>();


    public void ricxvebis_micema() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter star name:");
        this.name = input.nextLine();
        System.out.print("Enter star diameter: ");
        this.diameter = input.nextInt();
        System.out.print("Enter star temperature: ");
        this.temperature = input.nextInt();
    }
    public void ricxvebis_chveneba() {
        System.out.println("this star's name is - "+this.name);
        System.out.println("this star's diameter is - "+this.diameter);
        System.out.println("this star's temperature is - "+this.temperature);
    }


    public void write_in_file(){
        try{
            FileWriter file = new FileWriter("galaxy.txt",true);
            PrintWriter pw = new PrintWriter(file);
            pw.println("this star's name is - "+this.name);
            pw.println("this star's diameter is - "+this.diameter);
            pw.println("this star's temperature is - "+this.temperature);
            pw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

