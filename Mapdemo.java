package node;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapdemo {

    public static void main(String[] args) {
        Product defaultProduct = new Product("whell", 123);

        Product product1 = new Product("car", 121);
        Product product2 = new Product("plane", 111);
        Product product3 = new Product("train", 123);

        Map<Integer, Product> idToProduct = new HashMap<>();

        idToProduct.put(1, product1);
        idToProduct.put(2, product2);
        idToProduct.put(3, product3);

        //Product result = idToProduct.get(10);
        Product result = idToProduct.getOrDefault(10, defaultProduct);
        System.out.println(result);
        System.out.println(idToProduct.get(10));

        idToProduct.forEach((key,value) ->{
            System.out.println(key + " - > " + value);
        });

    }


}
