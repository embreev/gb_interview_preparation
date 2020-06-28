package com.geekbrains;

public class App 
{
    public static void main( String[] args )
    {
        Person p1 = new Person();
        p1.setFirstName("Ivan").setMiddleName("Ivanovich").setLastName("Ivanov")
                .setCountry("Russia").setAddress("Moscow").setPhone("+79991234567").setAge(35).setGender("M");
        p1.printPerson();
    }
}
