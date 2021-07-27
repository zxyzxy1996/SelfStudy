package com.myself.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zheng xinyu
 * @date 2021/4/2 17:12
 */
public class Test {

    public static void main(String[] args) {

        List<A> aList = new ArrayList<>();
        List<B> bList = new ArrayList<>();

        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        A a5 = new A();
        A a6 = new A();

        a1.setId("1");
        a1.setVin("A1");
        a2.setId("2");
        a2.setVin("A2");
        a3.setId("3");
        a3.setVin("A3");
        a4.setId("4");
        a4.setVin("A4");
        a5.setId("5");
        a5.setVin("A5");
        a6.setId("6");
        a6.setVin("A6");

        aList.add(a1);
        aList.add(a2);
        aList.add(a3);
        aList.add(a4);
        aList.add(a5);
        aList.add(a6);

        B b1 = new B();
        B b2 = new B();
        B b3 = new B();
        B b4 = new B();
        B b5 = new B();
        B b6 = new B();
        b1.setVin("A1");
        b2.setVin("A2");
        b3.setVin("A3");
        b4.setVin("A4");
        b5.setVin("A5");
        b6.setVin("A6");

        bList.add(b1);
        bList.add(b2);
        bList.add(b3);
        bList.add(b4);
        bList.add(b5);
        bList.add(b6);

    }

    static class A {
        private String id;

        private String vin;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getVin() {
            return vin;
        }

        public void setVin(String vin) {
            this.vin = vin;
        }
    }

    static class B {
        private String id;

        private String vin;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getVin() {
            return vin;
        }

        public void setVin(String vin) {
            this.vin = vin;
        }
    }
}
