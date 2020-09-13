package ru.geekbrains.homework5;
/* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 * Конструктор класса должен заполнять эти поля при создании объекта;
 * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 * Создать массив из 5 сотрудников;
 * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
*/

    public class Person {
        String name;
        String position;
        String email;
        String phone;
        int salary;
        int age;

    public Person(String name, String email, String position, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


        public String toString() {
            return String.format("Имя Отчество: " + name + " | email: " + email
                    + " | Должность: " + position + " | Номер телефона: " + phone
                    + " | Зарплата: " + salary + " | Возраст: " + age);
        }

        public void print() {
            System.out.println(this);
        }

        Person(){
            Person[] PersonArray = new Person[5];
            PersonArray[0] = new Person("Катя Иванова", "ivanovakate@mail.ru", "Архитектор", "88005553535", 95000, 30);
            PersonArray[1] = new Person("Марк Иванов", "ivanovmark@mail.ru", "Дизайнер", "88005553434", 140000, 52);
            PersonArray[2] = new Person("Майа Иванова", "ivanovamaia@mail.ru", "Швея", "88005553333", 80000, 42);
            PersonArray[3] = new Person("Алексей Иванов", "ivanovalex@mail.ru", "Маркетолог", "88005553232", 220000, 27);
            PersonArray[4] = new Person("Макс Иванов", "ivanovmaks@mail.ru", "Риелтор", "88005553131", 160000, 48);

            for (int i = 0; i < PersonArray.length; i++)
                if (PersonArray[i].age > 40) PersonArray[i].print();

        }
    }


