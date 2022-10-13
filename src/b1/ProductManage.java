package b1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManage {
    List<Product> productList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("*******PRODUCTMANAGE********");
            System.out.println("1. THEM SAN PHAM");
            System.out.println("2. SUA THONG TIN SAN PHAM THEO ID");
            System.out.println("3. XOA SAN PHAM THEO ID");
            System.out.println("4. HIEN THI DANH SACH SAN PHAM");
            System.out.println("5. TIM KIEM SAN PHAM THEO TEN");
            System.out.println("6. SAP XEP SAN PHAM THEO GIA TANG DAN GIAM DAN");
            System.out.println("SU LUA CHON CUA BAN LA");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.err.println("vui long chon 1-6");
            }
        } while (true);
    }
    public static void inputProductList(Scanner sc){
        System.out.println("nhap so luong sp vao");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("nhap thong tin cho san pham "+(i+1));
            Product product = new Product();
            product.inputData(sc);

        }
    }
}
