package node;

import java.util.ArrayList;
import java.util.Collections;

public class Mapdemo3 {

    public static void main(String[] args) {
        Product product1 = new Product("Glass", 1);
        Product product2 = new Product("Wood", 2);
        Product product3 = new Product("SimCard", 3);

        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(product1);
        arrayList.add(product3);
        arrayList.add(product2);

//        System.out.println(arrayList.toString());
//        Collections.rotate(arrayList, 1);
//        System.out.println(arrayList.toString());
//        Collections.rotate(arrayList, 1);
//        System.out.println(arrayList.toString());
//        Collections.rotate(arrayList, 1);
//        System.out.println(arrayList.toString());
//        Collections.rotate(arrayList, 1);
//

//        System.out.println(arrayList);
//        Collections.shuffle(arrayList);
//        System.out.println(arrayList);
//        Collections.shuffle(arrayList);
//        System.out.println(arrayList);
//        Collections.shuffle(arrayList);

        System.out.println(arrayList);

        Collections.sort(arrayList, Product.BY_NANME);
        System.out.println(arrayList);

        Collections.singleton(1);
        Collections.emptySet();


        arrayList.sort(Product.BY_WEIGHT);
        System.out.println(arrayList);
    }
}
