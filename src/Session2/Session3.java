package Session2;
public class Session3 {
    public static void main(String args[]) {
        int a,b,c,S;
        System.out.println("Tong day Fibonacci 20 so la :");
        a=1;
        b=1;
        c=2;
        S=0;
        for (int i=4;i<20;i++) {
            a=b;
            b=c;
            c=a+b;
            S+=c;
        }
        System.out.println(+S);
    }
}
