import java.util.Random;

public class Fourth_task {
    Random rand = new Random();
    int N = rand.nextInt(20000-10000)+10000;
    int M = rand.nextInt(20000-10000)+10000;


    public void even_and_odd() {
        System.out.println("N: "+ N);
        System.out.println("M: "+ M);
        for (int i = 10; i < 100; i++) {
            if (N % i == 0 && i % 2==0){
                System.out.println("N-divisor: " + i);
            }
            if(M%i ==0 && i %2 ==1){
                System.out.println("M-divisor: " +i);
            }
        }
    }
}
