package homework.hw1.Shop;

import java.util.List;
import java.util.Comparator;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice(List<Product> products) {
        products.sort((o1, o2)
                -> (Integer.toString(o1.getCost())).compareTo(
                Integer.toString(o2.getCost())));
        return products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct(List<Product> products) {
        return products.stream().max(Comparator.comparing(Product::getCost)).get();
    }

    public void printProducts (List<Product> products) {
        for (Product product: products) {
            System.out.println(product);
        }
    }

}
