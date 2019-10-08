package Session2;
public class Session3 {
    public static void main(String args[]) {
        int a,b,c;
        System.out.println("Day Fibonacci 10 so la :");
        a=1;
        System.out.println(+a);
        b=1;
        System.out.println(+b);
        c=2;
        System.out.println(+c);
        for (int i=0;i<7;i++) {
            a=b;
            b=c;
            c=a+b;
            System.out.println(+c);
        }
    }
}
