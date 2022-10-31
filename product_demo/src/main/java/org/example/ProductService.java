package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;

public class ProductService {

    public List<Product> getAllProduct(){
        Gson gson = new Gson();
        List<Product> list = new ArrayList<Product>();

        try {
            FileReader reader = new FileReader("product.json");
            Type type = new TypeToken<List<Product>>(){}.getType();
            list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    public void print(List<Product> list){
        list.forEach(p -> System.out.println(p.getId() +" - " + p.getName() + " - " +
                p.getDescription() + " - " + p.getColor() + " - " + Arrays.toString(p.getCategory() ) + " - "+
                p.getBrand() + " - " + p.getPrice() + " - " + p.getStatus()));
    }

    public void getAllBrands(List<Product> list){
        Set<String> brands = new HashSet<>();
        for(Product product : list){
            brands.add(product.getBrand());
        }
        System.out.println("-----DANH SÁCH CÁC HÃNG-----");
        brands.stream().sorted()
                .forEach(System.out::println);
    }

    public void getAllCategories(List<Product> list){
        Map<String, Integer> categoryMap = new HashMap<>();
        for(Product product : list){
            String[] categoryArray = product.getCategory();
            for(String str : categoryArray){
                if(!categoryMap.containsKey(str)){
                    categoryMap.put(str, 1);
                }else{
                    categoryMap.put(str, categoryMap.get(str) + 1);
                }
            }
        }
        System.out.println("-----DANH SÁCH DANH MỤC SẢN PHẨM-----");
        for(Map.Entry<String, Integer> entry : categoryMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
