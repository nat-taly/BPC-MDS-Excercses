package com.example.bpcmdsex03.student;

public class Student {
    String surname, name;
    int id, year;

    public Student(String surname, String name, int id, int year) {
        this.surname = surname;
        this.name = name;
        this.id = id;
        this.year = year;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        String str = "Student: <b>" + name + surname + "</b> ID: <b>" + id + "</b> Year: <b>" + year + "</b>";
        return str;
    }
}
