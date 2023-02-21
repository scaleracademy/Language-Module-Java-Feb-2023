package org.scaler.thiskeyword;

public class Child extends Parent {
    String someField = "some other value";

    public void printValueC() {
        System.out.println("this.someField = " + this.someField);
        System.out.println("super.someField = " + super.someField);

    }
}
