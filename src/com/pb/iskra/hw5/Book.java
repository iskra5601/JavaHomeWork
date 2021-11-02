package com.pb.iskra.hw5;

public class Book {
    private String name;
    private String author;
    private String createDate;


    public void returnBook(String fio) {

        System.out.println(fio + " вернул 3 книги");

    }

    public void returnBook(String... names) {

        for (String name : names) {
            System.out.println("Петров В. В. вернул книги: " + name);
        }

    }

    public void returnBook(Book... books) {

        for (Book book : books) {
            System.out.println("Петров В. В. вернул книги: " + book.getName() +" (" + book.getAuthor()+" " + book.getCreateDate()+ "г )" );
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    String getInfo() {
        return "[Автор: " + author + "Название: " + name + "Название: " + createDate + "]";

    }
}