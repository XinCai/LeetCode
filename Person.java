package DataStructure;

import java.util.List;
import java.util.function.Predicate;

public class Person {

    private void printConditionally(List<Person> people, Condition condition){
        for (Person p : people ) {
            if ((condition.test(p))){
                System.out.println(p.firstname);
            }
        }
    }

    private void printConditionlly1(List<Person> people, Predicate<Person> predicate){
        for (Person p : people) {
            if (predicate.test(p)){
                System.out.println(p);
            }
        }
    }


    private String firstname;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String lastname;
    private int age;

}

interface Condition{
        boolean test(Person person);
}
