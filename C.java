import java.util.Scanner;

public class C {
    int a,b,c;
    public static void main(String[] args) {
        C obj = new C();
        obj.assigner();

    }
     void assigner(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first num: ");
        a = sc.nextInt();

        System.out.println("enter the second num: ");
        b = sc.nextInt();

        System.out.println("enter the third num");
        c = sc.nextInt();


    }
    //meore metodi
     int LastDigit(){
        String stra = Integer.toString(a);
        char last = stra.charAt(stra.length() -1);
        int lastdig = Integer.parseInt(Character.toString(last));
        return lastdig ;

    }

    //mesame metodi
    int FirstDigit(){
        String stra = Integer.toString(a);
        char first = stra.charAt(1);
        int firstdig = Integer.parseInt(Character.toString(first));
        return firstdig ;

    }

    int SumOfDigits(){
        int n, sum=0;
        while (c>0){
            n = c % 10;
            sum = sum + n;
            c = c / 10;

        }
        return sum;
    }

     int Method5(){
        int xxx=FirstDigit()*LastDigit();
        System.out.println(xxx);
        return xxx;
    }

    void Method6(){
        System.out.println(FirstDigit()+Method5());
    }

}
