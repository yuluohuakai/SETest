package test;

public class Dog extends Animal{
    int age;
    public Dog(){
        super(1);
        System.out.println("dog");
    }

    public Dog(int m, int n){
        this();
        System.out.println("&&&");

        System.out.println("Dog m n");
    }

    public Dog(int n){
        this();
        System.out.println("***");
        this.age = n;
        System.out.println("Dog n");
    }
}
