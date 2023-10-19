package org.swaglabs.dataprovider;

import org.swaglabs.products.Product;
import org.testng.annotations.DataProvider;

public class ProductDataProvider {
    @DataProvider(name = "productsDataProvider")
    public Object[][] createProductsProvider() {
        Product product1 = new Product("1");
        Product product2 = new Product("2");
        Product product3 = new Product("3");
        Product product4 = new Product("4");
        Product product5 = new Product("5");
        Product product0 = new Product("0");

        return new Object[][]{new Object[]
                {product1},
                {product2},
                {product3},
                {product4},
                {product5},
                {product0},

        };
    }
}
