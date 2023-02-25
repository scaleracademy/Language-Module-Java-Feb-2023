package org.scaler.inheritence;

public class Teacher extends Person {
    String subject;

    @Override
    boolean isAdult() {
        return true;
    }
}
