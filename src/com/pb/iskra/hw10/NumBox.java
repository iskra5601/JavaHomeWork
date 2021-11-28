package com.pb.iskra.hw10;

public class NumBox<T extends Number> {
    private T[] numbers;
    public T[] getNumbers() {
        return numbers;
    }

    public void setNumbers(T[] numbers) {
        this.numbers = numbers;
    }

    // - массив из объектов класса T,----------DONE






    int counter = 0;
    //    инициализировать массив в конструкторе.----------DONE
    public NumBox(T[] numbers) {

        this.numbers = numbers;
    }

    //        - метод T get(int index) возвращающий число по индексу.  ----------DONE
    public T get(int index) {
        return numbers[index];
    }

    //   метод void add(T num) добавляющий число в массив. В случае если массив полон - выбросить исключение.


    //        - конструктор принимающий параметр - максимальную длину массива.----------DONE
    public NumBox(int size) {
        numbers = (T[]) new Number[size];

    }

    public void add(T num, T index) throws Exception {
        if (index.intValue() > numbers.length - 1) {
            throw new Exception();
        } else {
            this.numbers[index.intValue()] = num;
        }
    }

    //        - метод int length() возвращает текущее количество элементов.
    public int length() {
        System.out.println("Кол-во элементов в массивe:  " + counter);
        return counter ;
    }

    //        - метод double sum() - сумма всех элементов массива.----------DONE
    public double sum() {
        double sum = 0.0;
        for (T i : numbers) {
            if (i != null) {
                sum += i.doubleValue();
            } else break;
        }
        System.out.println("Сумма чисел в массиве: " + sum);
        return sum;
    }

    //        - метод double average() - подсчет среднего арифметического среди элементов массива.----------DONE
    public double average() {
        double average = 0;

        for (T i : numbers) {

            if (i != null) {
                counter++;
                average += i.doubleValue();
            } else break;
        }
        System.out.println("Среднее арифметическое " + average / counter);
        return average;
    }
//    - метод T max() - максимальный элемент массива.

  public T max() {
        T maxValue = numbers[0];

        for (int i=0;i < counter; i++){
           if(numbers[i].doubleValue() > maxValue.doubleValue())
                maxValue=numbers[i];

        }
      System.out.println("максимальное число : " +maxValue);
    return maxValue;
    }
}



