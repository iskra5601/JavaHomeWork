package com.pb.iskra.hw5;

public class Library {
    public static void main(String[] args){

    Reader reader1 = new Reader( );
    Reader reader2 = new Reader();
    Reader reader3 = new Reader();
    Reader reader4 = new Reader();

    Book book1 = new Book ();
    Book book2 = new Book ();
    Book book3 = new Book ();
    Book book4 = new Book ();

        reader1.setFio("Петров В. В.");
        reader2.setFio("Иванов В. В.");
        reader3.setFio("Сидоров В. В.");
        reader4.setFio("Петухов В. В.");

        book1.setAuthor("Кафка.А.А.");
        book1.setName("Приключения");
        book1.setCreateDate("2000");

        book2.setAuthor("Нитше.А.А.");
        book2.setName("Словарь");
        book2.setCreateDate("1980");

        book3.setAuthor("Ремарк.А.А.");
        book3.setName("Энциклопедия");
        book3.setCreateDate("2010");

        book4.setAuthor("Гёте.А.А.");
        book4.setName("Рассказы");
        book4.setCreateDate("1850");


        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());
        System.out.println(book4.getInfo());

        reader1.takeBook("Петров");
        reader1.takeBook("Словарь", "Энциклопедия", "Рассказы");
        reader1.takeBook(book1,book2,book3);

        book1.returnBook("Петров");
        book1.returnBook("Словарь", "Энциклопедия", "Рассказы");
        book1.returnBook(book1,book2,book3);

        System.out.println(reader1.getInfo());
        System.out.println(reader2.getInfo());
        System.out.println(reader3.getInfo());
        System.out.println(reader4.getInfo());
    }


}