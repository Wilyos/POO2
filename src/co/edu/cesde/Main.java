package co.edu.cesde;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);

        String productName, productBrand;
        double productPrice;

        System.out.println("Ingrese el precio del producto: ");
        productPrice=Double.parseDouble(inputData.nextLine());
        System.out.println("Ingrese el nombre del producto: ");
        productName = inputData.nextLine();
        System.out.println("Ingrese la marca del producto: ");
        productBrand=inputData.nextLine();





        Product monitorHp = new Product(productPrice,productName,productBrand);

        System.out.println(monitorHp.getName());
        System.out.println(monitorHp.getBrand());
        System.out.println(monitorHp.getPrice());
    }
}
