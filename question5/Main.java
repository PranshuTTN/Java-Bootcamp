package question5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Pranshu","","Saluja","Delhi",10000L);
        Employee e2 = new Employee("Divyanshu","","XYZ","Mumbai",4000L);
        Employee e3 = new Employee("Nitin","","ABC","Delhi",3000L);
        Employee e4 = new Employee("Sahil","","ABC","Mumbai",6000L);
        Employee e5 = new Employee("Mehar","","HJK","Delhi",2500L);
        Employee e6 = new Employee("Nitin","","ABC","Delhi",3500L);
        List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5,e6);
        list.stream()
                .filter(e -> e.salary<5000)
                .filter(e -> e.city=="Delhi")
                .distinct()
                .forEach(e-> System.out.println(e.fullName.split(" ")[0]));
    }
}