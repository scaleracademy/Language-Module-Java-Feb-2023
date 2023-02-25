package org.scaler.generics;

import java.util.ArrayList;
import java.util.Collections;

public class Generics {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Hello");
        list.add(1);
        list.add(true);
        list.add(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        ((Runnable) list.get(3)).run();

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Hello");
        list2.add("World");
        ((ArrayList) list2).add(1);

        System.out.println(list2);

        System.out.println(list2.getClass().equals(list.getClass()));


        Pair<String> pair = new Pair<String>("Hello", "World");
        System.out.println(pair.balanced());
        System.out.println(pair.impaired());

        Pair<Integer> pair2 = new Pair<>(4, 4);
        System.out.println(pair2.balanced());

        Person p1 = new Person("John", 20);
        Person p2 = new Person("Jane", 22);
        Person p3 = new Person("Jack", 22);

        Pair<Person> pair3 = new Pair<>(p1, p2);
        System.out.println(pair3.balanced());

        Pair<Person> pair4 = new Pair<>(p2, p3);
        System.out.println(pair4.balanced());
    }
    static class Person implements Comparable<Person> {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public int compareTo(Person other) {
            return this.age - other.age;
        }
    }
}
