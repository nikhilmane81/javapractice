package com.nikhil.steamdemo;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
    private Integer id;
    private String name;
    private List<String> projects;
    private Double salary;

    public Employee(Integer id, String name, List<String> projects, Double salary) {
        this.id = id;
        this.name = name;
        this.projects = projects;
        this.salary = salary;
    }

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", projects=" + projects +
                ", salary=" + salary +
                '}';
    }
}
public class StreamDemo
{
    static List<Employee> employees = new ArrayList<>();
    static
    {
        employees.add(new Employee(1,"Nikhil", List.of("P1", "P2", "P3"), 4500.0));
        employees.add(new Employee(1,"Aishwarya", List.of("P2", "P3"), 8900.0));
        employees.add(new Employee(1,"Rahul", List.of("P1"), 7500.0));
        employees.add(new Employee(1,"Somesh", List.of("P1", "P2", "P3", "P4"), 8500.0));
        employees.add(new Employee(1,"Manish", List.of("P1", "P2", "P3", "P5"), 9500.0));
    }

    public static void main(String[] args) {
        //Basic operation, using foreach on stream
        //employees.stream().forEach(System.out::println);

        //map and tolist
        List<Employee> incrementedsal = employees.stream()
                .map(employee -> new Employee(
                        employee.getId(),
                        employee.getName(),
                        employee.getProjects(),
                        employee.getSalary()*1.20
                )).toList();

        //System.out.println(incrementedsal);

        //filter

        List<Employee> increwithfilter = employees.stream()
                .filter(employee -> employee.getSalary()<8000.0)
                .map(employee -> new Employee(
                        employee.getId(),
                        employee.getName(),
                        employee.getProjects(),
                        employee.getSalary()*1.50
                )).toList();

        //System.out.println(increwithfilter);

        //filter and gerfirst

        Employee emp = employees.stream()
                .filter(employee -> employee.getSalary()<8000.0)
                .map(employee -> new Employee(
                        employee.getId(),
                        employee.getName(),
                        employee.getProjects(),
                        employee.getSalary()*1.50
                )).findFirst()
                .orElseThrow(()-> new RuntimeException("Emp not found"));

        //System.out.println(emp);


        //flatmap
        String Projects = employees.stream()
                .map(Employee::getProjects)
                .flatMap(Collection::stream)
                .collect(Collectors.joining(","));

        //System.out.println(Projects);

        List<Employee> shortcircuit = employees
                .stream()
                .skip(2)
                .limit(1)
                .toList();

        //System.out.println(shortcircuit);

        List<Employee> sortedbynamelist = employees
                .stream()
                /*.sorted(((o1, o2) -> o1.getName().compareTo(o2.getName())))   Internal implementation*/
                .sorted((Comparator.comparing(Employee::getName)))
                .toList();

        //System.out.println(sortedbynamelist);


        //sorting
        List<Employee> sortedbysalary = employees.stream()
                .sorted(((o1, o2) -> o2.getSalary().compareTo(o1.getSalary())))    //Reverse order
                .toList();
       // System.out.println(sortedbysalary);


        Employee maxemp = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(()->new RuntimeException("Not found"));

        System.out.println(maxemp);


        Double totalsalary = employees.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);

        System.out.println(totalsalary);







    }

}
