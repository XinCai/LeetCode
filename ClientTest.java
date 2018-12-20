package node;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class ClientTest {
    public static void main(String[] args) {
        Employee employee = new Employee("rajeev", 24);
        Employee employee1 = new Employee("rajeev", 25);
        Employee employee2 = new Employee("rajeev", 24);

        System.out.println("equal ? : " + employee.equals(employee2));

        HashSet<Employee> employees = new HashSet<Employee>();

        employees.add(employee);
//        employees.add(employee2);

        System.out.println(employees.contains(employee2));

        System.out.println("employee.hashCode():  " + employee.hashCode()
                + "  employee2.hashCode():" + employee2.hashCode());


        SortedSet<String> strings = new TreeSet<>();

        strings.add("hello");
        strings.add("hello");
        strings.add("world");

        System.out.println(strings.size());
        System.out.println(strings.first());
    }
}
