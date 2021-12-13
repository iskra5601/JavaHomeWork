package com.pb.iskra.hw11;

import java.util.ArrayList;
import java.util.List;

public class TelephoneBook {
    List<Telephone> list = new ArrayList<>();
    Telephone telephone = new Telephone();


    public boolean add(Telephone telephone) {
        List<Telephone> list = new ArrayList<>();


        list.add(telephone);

        return false;
    }

    public boolean remove(String id) {

        return false;
    }

//1) как клиент будет добавлятять данные в электронну клигу?
    // через некст лайн?
    // Как мне добавлять объект в ArrayList?
    //


// сортировка через стрим апи.!!!!!!!!!!!!
// пишет!!!!!!!!!!!

}


//Создать в пакете hw11 консольное приложение "Телефонная книга".
//Каждый элемент должен иметь:
//
//    ФИО
//    дата рождения
//    телефоны (количество не ограничено)
//    адрес
//    дата и время редактирования
//
//
//Обеспечить следующий функционал:
//
//    добавление элемента
//    удаление элемента
//    поиск элементов
//    вывод всех записей с сортировкой по указанному полю (можно ограничиться двумя на выбор)
//    редактирование элемента
//    запись в файл всех данных
//    загрузка из файла всех данных