package com.geekbrains;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public Person() {
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Person setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public Person setCountry(String country) {
        this.country = country;
        return this;
    }

    public Person setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public Person setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public void printPerson() {
        System.out.printf("ФИО: %s %s %s; Адрес: %s, %s; Телефон: %s; Возраст: %d; Пол: %s",
                this.firstName, this.middleName, this.lastName,
                this.country, this.address, this.phone, this.age, this.gender);
    }
}
