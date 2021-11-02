package com.pb.iskra.hw5;

import java.util.Scanner;

public class Reader {

    public String fio;
    public int readerNumber;
    public String createDate;
    public String faculty;
    public String birthdayDate;
    public int phoneNumber;

    public void takeBook(String fio) {

        System.out.println(fio + " взял 3 книги");

    }

    public void takeBook(String... names) {

        for (String name : names) {
            System.out.println("Петров В. В. взял книги: " + name);
        }

    }

    public void takeBook(Book... books) {

        for (Book book : books) {
            System.out.println("Петров В. В. взял книги: " + book.getName() +" (" + book.getAuthor()+" " + book.getCreateDate()+ "г )" );
        }

    }


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getReaderNumber() {
        return readerNumber;
    }

    public void setReaderNumber(int readerNumber) {
        this.readerNumber = readerNumber;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    String getInfo() {
        return "[ученик: " + fio + "]";


    }
}
