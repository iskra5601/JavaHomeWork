package com.pb.iskra.hw11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Telephone> list = new ArrayList<>();
        Telephone telephone = new Telephone();

        TelephoneBook telephoneBook = new TelephoneBook();
        telephoneBook.add(telephone);

        telephone.setFio("Искра Дмитрий");
        telephone.setPhone(939332334);
        telephone.setPhone(971415839);
        telephone.setBirthDate("08.02.1993");
        telephone.setAdress("Славы 32");
        telephone.setId("тест");


        list.add(telephone);

        list.forEach(System.out::println);


    }
}
//    ФИО
//    дата рождения
//    телефоны (количество не ограничено)
//    адрес
//    дата и время редактирования