import java.util.Random;
import java.util.Scanner;

public class Third_task {
    public int money = 100;
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public void Continue(){
        System.out.println("do you want to continue?: Y/N");
        String option = sc.next();

        if(option.equals("Y")){
            System.out.println("continue");
        }
        else if (option.equals("N")){
            System.out.println("bye");
        }
    }

    public void Create_graph_and_play(){
        int[][] graph = new int[5][3];
        for(int i =0; i<5; i++){
            for(int j=0; j<3; j++){
                graph[i][j] = rand.nextInt(2-(-2)+(-2));
            }
        }

        for(int i =0; i<5; i++){
            if(graph[i][0]+graph[i][1]+graph[i][2]>0){
                money +=5;
            }
            else {
                money -=5;
            }
        }
        System.out.println("updated money: " + money);
        Continue();
    }
}
