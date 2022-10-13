package b1;

import java.util.Scanner;

public class Product implements Comparable<Product>{
    private String productID;
    private String productName;
    private float price;

    public Product() {
    }

    public Product(String productID, String productName, float price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return (int)(this.getPrice() - o.getPrice());
    }
    public void inputData(Scanner sc){
        System.out.println("nhap ma sp vao");
        this.productID = sc.nextLine();
        System.out.println("nhap ten sp vao");
        this.productName = sc.nextLine();
        System.out.println("nhap gia sp vao");
        this.price = Float.parseFloat(sc.nextLine());
    }
    public  void displayData(){
        System.out.printf("ma sp: %s - ten sp: %s - gia ban: %f",this.productID,this.productName,this.price);
    }
}
