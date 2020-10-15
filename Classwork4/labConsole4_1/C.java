import java.util.Scanner;

public class C {
    int a = 10, b = 9;
    String s = "#", h = "@";
    Scanner sc = new Scanner(System.in);

    public void Method1(){
        System.out.println(a);
        System.out.println(b);
    }

    public void Method2(){
        System.out.println(s);
        System.out.println(h);
    }

    public void Method3(){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }

    public void Method4(){
        System.out.println("enter a: ");
        a = sc.nextInt();
    }

    public void Method5(){
        System.out.println("enter b: ");
        b = sc.nextInt();
    }

    public void Method6(){
        System.out.println("enter s: ");
        s = sc.next();
        System.out.println("enter h: ");
        h = sc.next();
    }
}
