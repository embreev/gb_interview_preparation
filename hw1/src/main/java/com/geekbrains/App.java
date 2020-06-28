package com.geekbrains;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("1");
        Person p1 = new Person();
        p1.setFirstName("Ivan").setMiddleName("Ivanovich").setLastName("Ivanov")
                .setCountry("Russia").setAddress("Moscow").setPhone("+79991234567").setAge(35).setGender("M");
        p1.printPerson();

        System.out.println();
        System.out.println("3");
        Shape circle = new Circle(10.0);
        Shape rectangle = new Rectangle(5.0, 7.0);

        System.out.println("Площадь круга: " + circle.getSquare());

        System.out.println("Площадь прямоугольника: " + rectangle.getSquare());
    }
}
