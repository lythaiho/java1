package assignment4;

import java.util.ArrayList;

public class Cartss4 {
    private int id;
    private String customer;
    private int grandTotal;
    private ArrayList<Product4> productList;
    private String city;

    public Cartss4(){
        productList = new ArrayList<>();
    }

    public Cartss4(int id, String customer, int grandTotal, ArrayList<Product4> productList, String city) {
        this.id = id;
        this.customer = customer;
        this.grandTotal = grandTotal;
        this.productList = productList;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(int grandTotal) {
        this.grandTotal = grandTotal;
    }

    public ArrayList<Product4> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product4> productList) {
        this.productList = productList;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void addToCart(Product4 product){
        this.productList.add(product);
//        Product4 pr = new Product4();
//        this.productList.add(pr);
    }
    public void removeToCart(int x){
        this.productList.remove(x);
    }

    public void showInfo(){
        for (Product4 u: this.productList){
            u.getInfo();
        }
    }
}
