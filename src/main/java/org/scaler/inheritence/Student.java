package org.scaler.inheritence;

public class Student extends Person {
    String[] subjects;
    int grade;

    @Override
    boolean isAdult() {
        return false;
    }
}
