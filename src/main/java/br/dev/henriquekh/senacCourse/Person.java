package br.dev.henriquekh.senacCourse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private String name;
    private LocalDate birthDate;
    private String address;
    private String phoneNumber;
    private String email;
    private String cpf;
    private Sex sex;
    private MaritalStatus maritalStatus;
    private String job;
    private double salary;
    private String nationality;
    private int children;
    private String favoriteColor;

    public Person(String name, String cpf, String email, String phoneNumber, LocalDate birthDate, String job,
            double salary,
            String address, String favoriteColor, String nationality, Sex sex, MaritalStatus maritalStatus,
            int children) {
        setName(name);
        this.birthDate = birthDate;
        updateAddress(address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setCpf(cpf);
        setSex(sex);
        setMaritalStatus(maritalStatus);
        setJob(job);
        setSalary(salary);
        this.nationality = nationality;
        setChildren(children);
        setFavoriteColor(favoriteColor);
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("name cannot be null or empty");
        }
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (!phoneNumber.matches("^\\(\\d\\d\\)\\s?\\d{5}-\\d{4}$")) {
            throw new IllegalArgumentException("phone number is invalid");

        }
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        if (!email.matches(
                "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")) {
            throw new IllegalArgumentException("email is invalid");
        }
        this.email = email;
    }

    public void setChildren(int children) {
        if (children < 0) {
            throw new IllegalArgumentException("children cannot be negative");
        }
        this.children = children;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("salary cannot be negative");
        }
        this.salary = salary;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void updateAddress(String address) {
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

    public int getChildren() {
        return children;
    }

    public String getEmail() {
        return email;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Sex getSex() {
        return sex;
    }

    public void displayInfo() {
        System.out.printf("%s\n", getName());
        System.out.printf("\tData de Nascimento: %s\n", getBirthDate().format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.printf("\tIdade: %d\n", getAge());
        System.out.printf("\tEndereço: %s\n", getAddress());
        System.out.printf("\tTelefone: %s\n", getPhoneNumber());
        System.out.printf("\tEmail: %s\n", getEmail());
        System.out.printf("\tCPF: %s\n", getCpf());
        System.out.printf("\tSexo: %s\n", getSex().toSexString());
        System.out.printf("\tEstado Civil: %s\n", getMaritalStatus().getMaritalStatusString());
        System.out.printf("\tProfissão: %s\n", getJob());
        System.out.printf("\tSalário: R$%.02f\n", getSalary());
        System.out.printf("\tNacionalidade: %s\n", getNationality());
        System.out.printf("\tFilhos: %s\n", getChildren());
        System.out.printf("\tCor Favorita: %s\n", getFavoriteColor());
    }
}
