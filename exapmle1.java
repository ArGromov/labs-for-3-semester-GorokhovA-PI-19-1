package com.company;
import java.io.*;

public class exapmle1 {
    public static void main(String[] args) {
        try {

            File f1=new File("textforexample1-1.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("Создан!!!!");
                System.out.println("Полный путь1: "+ f1.getAbsolutePath());
            }

            File f2=new File("D:\\textforexample1-2.txt");
            f2.createNewFile();
            System.out.println( "Полный путь 2: "+ f2.getAbsolutePath());

            File f3=new File("D:\\folderforexample1-1\\folderforexample1-2\\folderforexample11-3");
            f3.mkdirs();
            System.out.println("Полный путь 3: "+ f3.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("Ошибка!!! "+e);
        }
    }}
