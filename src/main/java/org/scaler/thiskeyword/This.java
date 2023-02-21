package org.scaler.thiskeyword;

public class This {

    public static void main(String[] args) {
        /*
        What does the keyword "this" mean in Java?
            - reference to current object
            - used to access instance variables and methods
            - used to invoke current class constructor
        What places can "this" be used ?
            - inside constructor
            - inside a method of a class (even if it is abstract)
        What places can we NOT write "this" ?
            - inside static method
         */
        Child c = new Child();
        System.out.println(c.someField); // ✅ "some other value"
        c.printValueP(); // ✅ "some value"
        c.printValueC(); // ✅ "some other value"

    }
}
