package com.academy.Task_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Model> someList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            someList.add(i, (new Model("Model " + i)));
        }

        Class_A.Class_B classB = new Class_A.Class_B(someList);
        Class_A classA = new Class_A(someList, classB);

        classA.toString();
        System.out.println();
        classB.toString();

    }
}
