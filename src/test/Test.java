package test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog(1);
        Dog d1 = new Dog(1, 2);
//        Dog d2 = new Dog();
        Animal a = new Dog(1);
        a.shot();

        d.h = 1;
        System.out.println(d.h);
        Animal a2 = (Animal)d;
        System.out.println(a2.h);

        String s3 = "a";
        String s1 =new String("a");
        String s2 ="a";
        System.out.println(s1==s2);

        final char[]arr = new char[]{'1','2','3'};
        for (int i : arr) {
            System.out.println(i);
        }
        arr[2]='5';
        for (int i : arr) {
            System.out.println(i);
        }

        String aaa = "aaa";
        System.out.println(aaa);

        String bbb = "bbb";
        String ccc = aaa + bbb;
        String ddd = "aaa" + "bbb";
        String eee = "aaabbb";
        System.out.println(ddd==eee);
        System.out.println(ddd.toString());
        System.out.println(ddd==eee);

        String fff = aaa.concat("bbb");
        System.out.println(fff);
        System.out.println(fff == ddd);

        String s11 = null;
        StringBuffer s = new StringBuffer();
        s.append(s11);
        System.out.println(s);

        Collection cl1 = new ArrayList();
        cl1.add(123);
        cl1.add(124);
        cl1.add(1234);
        cl1.add(1231);

        Collection cl2 = new ArrayList();
        cl2.add(123);
        cl2.add(124);
        cl2.add(12354);
        cl2.add(12315);

        ArrayList cl3 = new ArrayList();
        cl3.add(1);
        cl3.add(5);
        cl3.add(2);
        cl3.add(4);
        cl3.remove(2);

        cl1.removeAll(cl2);
        System.out.println(cl1);
        System.out.println(cl3);



    }
}
