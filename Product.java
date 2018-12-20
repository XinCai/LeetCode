package node;

import java.util.Comparator;

public class Product implements Comparable{

    public static final Comparator<Product> BY_NANME = Comparator.comparing(Product::getName);
    public static final Comparator<Product> BY_WEIGHT = Comparator.comparing(Product::getWeight);

    public static void main(String[] args) {
        Product p1 = new Product("book",1);
        Product p2 = new Product("car", 12);
        Product p3 = new Product("chair", 1);

        // implement comparable is for this object sorting usage
        System.out.println(p1.compareTo(p2));
    }

    public Product(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    private String name;
    private Integer weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Object object) {
        Product other = (Product)object;
        if (getWeight() > other.getWeight()){
            return 1;
        }else if (getWeight() < other.getWeight()){
            return -1;
        }else return 0;
    }

    @Override
    public String toString() {
        return "name: "+ this.name + "weight: " + this.weight;
    }
}
