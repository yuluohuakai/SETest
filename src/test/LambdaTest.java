package test;

import java.util.ArrayList;

public class LambdaTest {
    public static void main(String[] args) {
        Human h1 = new Human("Tom", 12);
        Human h2 = new Human("Tom", 14);
        Human h3 = new Human("Alice", 12);
        Human h4 = new Human("Alice", 11);
        Human h5 = new Human("Lilei", 16);

        ArrayList list = new ArrayList<Human>();
        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        list.add(h5);

        list.sort((o1, o2)-> {
            Human human1 = (Human) o1;
            Human human2 = (Human) o2;
            if(human1.name.compareTo(human2.name)==0){
                return Integer.compare(human1.age, human2.age);
            }else{
                return human1.name.compareTo(human2.name);
            }
        });

        list.forEach(System.out::println);
    }
}

class Human implements Comparable{
    int age;
    String name;

    public Human(String name,int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Object obj) {
        if(!(obj instanceof Human)){
            throw new RuntimeException("数据类型不正确");
        }
        Human h = (Human) obj;
        if(this.name.compareTo(h.name)!=0){
            return Integer.compare(this.age, h.age);
        }else{
            return this.name.compareTo(h.name);
        }
    }


    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
