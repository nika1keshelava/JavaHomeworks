import java.util.Scanner;

public class A {
    protected int x;
    public static void main(String[] args) {
        B gamomdzaxebeli = new B();
        gamomdzaxebeli.Method1();
        gamomdzaxebeli.Method2();
        gamomdzaxebeli.Method3();
        gamomdzaxebeli.Method4();
        gamomdzaxebeli.Method5();

    }

    public A(){
        System.out.println("Hello");

    }

    protected void Method1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number x: ");
        x = sc.nextInt();
    }

    protected void Method2(){
        System.out.println(x+12);
    }

    protected void Method3(){
        if (x%2==0){
            System.out.println("x is even");
        }
        else{
            System.out.println("x is odd");
        }

    }

}

class B extends A{
    private int y;
    public void Method4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number y: ");
        y = sc.nextInt();

    }

    public int Method5(){
        return x+y;
    }
}

