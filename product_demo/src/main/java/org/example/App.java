package org.example;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProductService service = new ProductService();
        List<Product> productList = service.getAllProduct();
        System.out.println("-------DANH SÁCH SẢN PHẨM--------");
        service.print(productList);

        service.getAllBrands(productList);

        service.getAllCategories(productList);
    }
}
