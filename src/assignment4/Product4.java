package assignment4;
import  java.util.Scanner;

public class Product4 {
    private int id;
    private String productName;
    private int qty;
    private  int price;

    public Product4(){

    }

    public Product4(int id, String productName, int qty, int price) {
        this.id = id;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public  boolean checkQty(){
        if(this.getQty() >0){
            return true;
        }
        else{
            return false;
        }
    }

    public void themProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap ten san pham");
        productName =sc.nextLine();
        System.out.println("nhap so luong");
        qty = sc.nextInt();
        System.out.println("nhap gia");
        price = sc.nextInt();
    }
    public void getInfo(){
        System.out.println(this.getId());
        System.out.println(this.getProductName());
        System.out.println(this.getQty());
        System.out.println(this.getPrice());

    }
}

