package test;

public class Employee {
    int a = 1;

    public Employee(int a){
        this.a = a;
    }

    public int add(int b){
        b += 1;
        return b;
    }

    public static void swap(Employee e1, Employee e2){
        Employee temp =e1;
        e1 = e2;
        e2= temp;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(2);
        Employee employee2 = new Employee(3);
        swap(employee1, employee2);
        System.out.println(employee1.a);
        System.out.println(employee2.a);


    }
}
