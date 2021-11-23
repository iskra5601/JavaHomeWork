package com.pb.iskra.hw9;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Random;

public class FileNimbers2 {
    public static void main(String[] args) {
        Random random = new Random();


        try (Writer writer = new FileWriter("files/numbers.txt")) {
            int[][] array = new int[10][10];

            for (int i = 0; i < array.length; i++, System.out.println()) {
                for (int j = 0; j < array.length; j++) {

                    array[i][j] = (random.nextInt(100) );
                    System.out.println( array[i][j]);
                    writer.write(array[i][j]+" ");
                }
                writer.write("\n");//
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
