package com.academy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_1 {

    public static void main(String[] args) {
        String someText = "Some text: Arrays in Java are also objects. They need to be declared and then created. " +
                "In order to declare a variable that will hold an array of integers, we use the following syntax...";

        List<String> strings = Stream.of(someText.split("\\s")).collect(Collectors.toList());
        List<String> stringA = strings.stream()
                .filter(str -> str.matches("[a,A]+[a-zA-Z]*"))
                .collect(Collectors.toList());
        stringA.stream().forEach(System.out::println);

    }
}
