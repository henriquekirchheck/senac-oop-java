package br.dev.henriquekh.senacCourse;

public class Course {
    private String name;
    private double durationHours;

    public double getDurationHours() {
        return durationHours;
    }

    public String getName() {
        return name;
    }

    public void setDurationHours(double durationHours) {
        this.durationHours = durationHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course(String name, double durationHours) {
        this.durationHours = durationHours;
        this.name = name;
    }
}
