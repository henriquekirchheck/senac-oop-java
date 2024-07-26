package br.dev.henriquekh.senacCourse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private String name;
    private String cpf;
    private LocalDate birthDate;
    private String job;
    private String address;
    private String favoriteColor;

    public Person(String name, String cpf, LocalDate birthDate, String job, String address, String favoriteColor) {
        setName(name);
        setCpf(cpf);
        setJob(job);
        setAddress(address);
        setFavoriteColor(favoriteColor);
        this.birthDate = birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public void setJob(String job) {
        this.job = job;
    }

    private void setCpf(String cpf) {
        if (!cpf.matches("^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$"))
            throw new IllegalArgumentException("invalid cpf");
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return birthDate.until(LocalDate.now()).getYears();
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public String getJob() {
        return job;
    }

    public void displayInfo() {
        System.err.printf("%s\n", getName());
        System.err.printf("\tCPF: %s\n", getCpf());
        System.err.printf("\tEndereço: %s\n", getAddress());
        System.err.printf("\tIdade: %d\n", getAge());
        System.err.printf("\tData de Nascimento: %s\n", getBirthDate().format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.err.printf("\tCor Favorita: %s\n", getFavoriteColor());
        System.err.printf("\tTrabalho: %s\n", getJob());
    }
}
