package org.lessons.java.snack.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Snack_file {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Flage\\Desktop\\Java\\java-oop-snacks-1\\src-snack-file\\test.txt");

        try (Scanner scanner = new Scanner(file)) {
            System.out.println(scanner.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
