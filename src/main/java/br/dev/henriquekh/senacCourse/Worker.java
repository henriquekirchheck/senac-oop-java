package br.dev.henriquekh.senacCourse;

public class Worker {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
