package com.academy.Task_2;

import java.util.List;

public class Class_A {
    private List<Model> models;
    private Class_B classB;

    public Class_A(List<Model> models, Class_B classB) {
        this.models = models;
        this.classB = classB;
    }

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }

    public Class_B getClassB() {
        return classB;
    }

    public void setClassB(Class_B classB) {
        this.classB = classB;
    }

    @Override
    public String toString() {
        System.out.println("Class_A field_models: " + models);
        System.out.println("CLass_A field_B:      " + classB.getModels());
        return null;
    }

    public static class Class_B {
        private List<Model> models;

        public Class_B(List<Model> models) {
            this.models = models;
        }

        public List<Model> getModels() {
            return models;
        }

        public void setModels(List<Model> models) {
            this.models = models;
        }

        @Override
        public String toString() {
            System.out.println("Class_B field_models: " + models);
            return null;
        }

    }
}
