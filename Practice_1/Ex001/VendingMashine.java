package Practice_1.Ex001;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Торговый автомат
 * 
 * @param name - наименование автомата
 * @param productsCodes - интервал кодов продуктов
 * 
 * 
 */

public class VendingMashine {
    protected String name;
    protected String productsCodes;
    protected Map<Integer, Product> productSet = new HashMap<>();

    public VendingMashine(String name, String productsCodes) {
        this.name = name;
        this.productsCodes = productsCodes;
    }
    
    public VendingMashine(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getProductsCodes() {
        return productsCodes;
    }

    public Map<Integer, Product> getProductSet() {
        return productSet;
    }

    public void addProduct(int code, Product product, int productCode) {
        productSet.put(code, product);
    }
    public void addProduct(int code, Product product) {
        productSet.put(code, product);
    }


    public int buyerChoice(Scanner scan) {
        return scan.nextInt();
    }

    public Product showPrice(int choice) {
        Product forSale = productSet.get(choice);
        System.out.printf("Выбран товар: %s, стоимость %.2f\n", forSale.getName(), forSale.getPrice());
        return forSale;
    }

    public void sale(Product product,Scanner scan) {
        System.out.println("Внесите деньги для оплаты товара.");
        float deposit = 0f;
        while (deposit < product.getPrice()) {
            int cash = scan.nextInt();
            deposit += cash;
            if (deposit < product.getPrice())
                System.out.printf("Средств недостаточно. Добавьте еще %.2f\n", product.getPrice() - deposit);
            else if (deposit > product.getPrice()) {
                System.out.printf("Ваша сдача - %.2f\n", deposit - product.getPrice());
            }
    
        }
    }

    public void delivery(Product product) {
        System.out.println("Ваш товар находится в лотке в нижней части автомата");
        System.out.println("Спасибо за покупку! Будем рады видеть Вас снова!");
    }

    public void writeOff(Product product) {
        int quantityProduct = product.getQuantity();
        product.setQuantity(quantityProduct - 1);
        System.out.printf("Осталось - %s\n", product.toString());
    }

    @Override
    public String toString() {
        return "VendingMashine [name=" + name + "]";
    }


}
