package homework.hw1.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

    public static void main(String[] args) {

        Shop shop = new Shop();

        List<Product> products = new ArrayList<>();
        Product product1 = new Product(270, "apple");
        Product product2 = new Product(110, "banana");
        Product product3 = new Product(150, "orange");
        Product product4 = new Product(130, "lemon");

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        shop.setProducts(products);
        shop.printProducts(products);
        System.out.println("--- After sorting: ---\n");
        shop.printProducts(shop.sortProductsByPrice(products));
        System.out.println("--- Most expensive product: ---\n");
        System.out.println(shop.getMostExpensiveProduct(products));

        assertThat(shop.getProducts())
                .isNotNull()
                .hasSize(4)
                .contains(product1, product2, product3, product4);

        assertThat(shop.sortProductsByPrice(products).get(0).getCost()).isEqualTo(110);
        assertThat(shop.sortProductsByPrice(products).get(1).getCost()).isEqualTo(130);
        assertThat(shop.sortProductsByPrice(products).get(2).getCost()).isEqualTo(150);
        assertThat(shop.sortProductsByPrice(products).get(3).getCost()).isEqualTo(270);

        assertThat(shop.getMostExpensiveProduct(products).getCost()).isEqualTo(270);

    }

}
