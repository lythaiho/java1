package assignment4;
import  java.util.ArrayList;

public class Assignment4 {
    public static void main(String args[]){
        Product4 p = new Product4();
        Cartss4 c = new Cartss4();
        p.themProduct();
        p.themProduct();
        c.addToCart(p);
        c.addToCart(p);
        c.removeToCart(1);
        c.showInfo();
    }
}
