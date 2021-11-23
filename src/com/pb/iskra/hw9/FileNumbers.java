package com.pb.iskra.hw9;

import java.io.*;
import java.util.Random;

public class  FileNumbers {


    public void createNumbersFile() throws IOException {

        try (Writer writer = new FileWriter("files/numbers.txt")) {

            Random random = new Random();
            int[][] array = new int[10][10];

            for (int i = 0; i < array.length; i++, System.out.println()) {
                for (int j = 0; j < array.length; j++) {

                    array[i][j] = (random.nextInt(100) );
                    writer.write(array[i][j]+" ");
                }
                writer.write("\n");//
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }


  public void createOddNumbersFile() throws IOException {

      try (Reader reader = new FileReader("\"files/numbers.txt\"")) {
          char[] array = new char[100];


          reader.read(array);
          System.out.println("Data in the stream:");
          System.out.println(array);

      } catch (Exception e) {
          e.printStackTrace();
//        }
      }

  }
}




//В пакете hw9 создать класс FileNumbers.
//В нем создать методы:
//
//- createNumbersFile - создает текстовый файл "numbers.txt" заполненный
// случайными целыми числами от 1 до 99. 10 строк и по 10 чисел в каждой строке. Числа разделять пробелами.
//
//- createOddNumbersFile - читает файл "numbers.txt", и создает на основе него новый файл
// "odd-numbers.txt" в который входят все числа из "numbers.txt" только все четные заменены на 0.
//
//В методе main продемонстрировать работу методов createNumbersFile и createOddNumbersFile.
//
//По желанию можно добавить логирование работы программы.