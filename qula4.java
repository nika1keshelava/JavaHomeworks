import java.util.Scanner;

public class qula4{
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first num: ");
        a = sc.nextInt();

        System.out.println("enter the second num: ");
        b = sc.nextInt();

        if (a>b){

            int temp = a;
            a = b;
            b = temp;
        }

        int[] sia = new int[40];
        for (int i=0;i<40;i++){
            sia[i]=getRandomNumber(a,b);
        }

        int luwebisCounter=0, kentebisCounter=0, luwebisjami=0, kentebisjami=0;
        for (int element: sia) {
            if (element%2==0){
                luwebisCounter++;
                luwebisjami+=element;
            }
            else{
                kentebisCounter++;
                kentebisjami+=element;
            }
        }
        if (kentebisjami>luwebisjami){

            int temp = kentebisjami;
            kentebisjami = luwebisjami;
            luwebisjami = temp;
        }

        for (int i=0;i<5;i++) {
            getRandomNumber(kentebisjami, luwebisjami);
        }

    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }



}
