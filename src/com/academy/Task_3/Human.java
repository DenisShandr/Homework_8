package com.academy.Task_3;

import java.util.Optional;

public class Human {
    private Optional<String> name = Optional.empty();
    private Optional<Integer> Age;

    public Optional<String> getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Optional.ofNullable(name);
    }

    public Optional<Integer> getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = Optional.ofNullable(age);
    }
}
