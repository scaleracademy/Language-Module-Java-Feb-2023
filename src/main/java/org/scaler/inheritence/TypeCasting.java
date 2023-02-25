package org.scaler.inheritence;

public class TypeCasting {
    public static void main(String[] args) {
        Person p = new Person();
        Teacher t = new Teacher();
        Student s = new Student();

        var p1 = new Person();
        var t1 = new Teacher();
        var s1 = new Student();

        Person p2 = t1;
        Person p3 = new Teacher();

        if (p1 instanceof Person) {
            System.out.println("p1 is a Person");
        }
        if (t1 instanceof Person) {
            System.out.println("t1 is a Person");
        }
        if (t1 instanceof Teacher) {
            System.out.println("t1 is a Teacher");
        }
        if (p1 instanceof Teacher) {
            System.out.println("p1 is a Teacher");
        }

        if (p2 instanceof Teacher) {
            System.out.println("p2 is a Teacher");
        }
        // p2.subject // does not work

        ((Teacher) p2).subject = "Maths"; // works, because p2 is a Teacher

        // ((Teacher) p1).subject = "Maths"; // does not work, because p1 is not a Teacher


        Teacher tch = new Teacher();
        System.out.println("Teacher is adult = " + tch.isAdult());
    }
}
