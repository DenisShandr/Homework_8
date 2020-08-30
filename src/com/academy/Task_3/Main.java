package com.academy.Task_3;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();

        human1.setName("Sam");
        if (human1.getName().isPresent()) {
            System.out.println(human1.getName().get());
        }
        if (human2.getName().isPresent()) {
            System.out.println(human2.getName().get());
        } else {
            System.out.println("No name");
        }

    }
}
