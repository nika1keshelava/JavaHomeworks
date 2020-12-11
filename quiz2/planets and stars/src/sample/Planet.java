package sample;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Planet {
    String name;
    String star_name;
    int distance, speed;
    double time;

    public void ricxvebis_micema() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter planet name: ");
        this.name = input.nextLine();
        System.out.print("Enter star name: ");
        this.star_name = input.nextLine();
        System.out.print("Enter distance from "+this.star_name+": ");
        this.distance = input.nextInt();
        System.out.print("Enter planet's speed: ");
        this.speed = input.nextInt();
    }


    public void ricxvebis_chveneba() {
        System.out.println("planet's name is - "+this.name);
        System.out.println("star's name is - "+this.star_name);
        System.out.println("distance from star is - "+this.distance);
        System.out.println("speed is - "+this.speed);
        System.out.println("time for one cycle around the star - "+this.time);
    }

    public double drois_gamotvla(double star_diameter){
        return (star_diameter/2+this.distance)*Math.PI/this.speed;
    }

    public void write_in_file(){
        try{
            FileWriter file = new FileWriter("galaxy.txt",true);
            PrintWriter pw = new PrintWriter(file);
            pw.println("planet's name is - "+this.name);
            pw.println("star's name is - "+this.star_name);
            pw.println("distance is - "+this.distance);
            pw.println("speed is - "+this.speed);
            pw.println("time for one cycle around the star - "+this.time);
            pw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
