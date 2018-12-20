package node;

public class Customer {
    public static final Customer cus = new Customer();


    private String Name;

    private Integer Age;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }
}
