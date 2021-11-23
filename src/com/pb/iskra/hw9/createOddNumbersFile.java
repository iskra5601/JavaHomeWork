package com.pb.iskra.hw9;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class createOddNumbersFile {
    public static void main(String[] args) {

        Integer[][] matrix = readFromFile("files/numbers.txt");

        System.out.println("BEFORE");

        printMatrix(matrix);

        replaceOddNumbers(matrix);

        System.out.println("AFTER");

        printMatrix(matrix);

        writeToFile(matrix, "files/odd-numbers.txt");


    }

    private static void replaceOddNumbers(Integer[][] matrix) {
        for(int i = 0; i< matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(Integer[][] matrix) {
        for(int i = 0; i< matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print( matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static Integer[][] readFromFile(String p) {
        Path path = Paths.get(p);
        Integer[][] matrix = new Integer[10][10];
        try (BufferedReader reader = Files.newBufferedReader(path)) {


            String line;
            int lineIdx = 0;

            while ((line = reader.readLine()) != null) {
                String numbersFromLine[] = line.split(" ");
                Integer numbers[] = new Integer[10];
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = Integer.parseInt(numbersFromLine[i]);
                }
                matrix[lineIdx] = numbers;
                lineIdx++;
            }
        } catch (Exception ex) {
            System.out.println("Error with file read: " + ex);
        }
        return matrix;
    }

    public static void writeToFile(Integer[][] array, String path) {
        try (Writer writer = new FileWriter(path)) {
            for (Integer[] integers : array) {
                for (int j = 0; j < array.length; j++) {
                    writer.write(integers[j] + " ");
                }
                writer.write("\n");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }




}
