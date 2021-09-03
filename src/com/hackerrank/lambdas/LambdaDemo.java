package com.hackerrank.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("100", "anupam", "I");
        Employee emp2 = new Employee("101", "johny", "IT");
        Employee emp3 = new Employee("102", "uday", "IT");
        Employee emp4 = new Employee("103", "Ravi", "IT");
        Employee emp5 = new Employee("104", "Vatsha", "QA");
        Employee emp6 = new Employee("105", "Sandeep", "QA");
        Employee emp7 = new Employee("106", "yashwant", "QA");

        List<String> validDept = Arrays.asList("IT", "HR", "QA");

        List<Employee> empList = Arrays.asList(emp1, emp2, emp3,emp4,emp5,emp6,emp7);
        // get employees from QA dept
        List QAEmp = empList.stream().filter(e -> "QA".equals(e.getDept())).collect(Collectors.toList());
        // QAEmp.stream().forEach(System.out::println);
        
        List invalidDeptList = empList.stream().filter(e -> validDept.indexOf(e.getDept()) == -1).collect(Collectors.toList());
        // invalidDeptList.stream().forEach(System.out::println);

        List distinctDept = empList.stream().map(e -> e.getDept()).distinct().collect(Collectors.toList());
        distinctDept.stream().forEach(d -> System.out.println(d));





    }
}
