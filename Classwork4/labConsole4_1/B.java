import java.util.Scanner;

public class B {
    public int a = 33;
    public double b = 9.7;
    public String s = "#";

    public void Method1(){
        System.out.println(s);
    }

    public void Method2(){
        System.out.println(a);
    }

    public void Method3(){
        System.out.println(b);
    }

    public void Method4(){
        System.out.println(a-b);
    }

    public double Method5(){
        return a/b;
    }

    public void Method6(){
        a = 10;
        b = 5.6;
        s = "nika";
    }

    public void Method7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a: ");
        a = sc.nextInt();
    }

    public void Method8(){
        System.out.println(b+10);
    }
}
