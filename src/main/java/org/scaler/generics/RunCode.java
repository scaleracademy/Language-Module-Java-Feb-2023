package org.scaler.generics;

public class RunCode {

    public static void main(String[] args) {

        MyGeneric<MyAbstractClass> obj =
                new MyGeneric<>(new MyConcreteClass());
    }
}
