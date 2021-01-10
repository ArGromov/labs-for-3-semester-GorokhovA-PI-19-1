package com.company;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
//Горохов АА ПИ-19-1 вариант по номеру в списке группы - шестой
/*Задание: В исходном файле содержится 20 чисел типа int. В результирующий файл переписать только нечетные числа,
а при их отсутствии – сообщение, что в исходном файле нечетных чисел нет.*/

public class neposredstvenno_laba5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte[] data=new byte[0];

        File f1=new File("D://fileforlab5-source.txt");
        File f2=new File("D://fileforlab5-new.txt");

        try{
            BufferedReader reader=new BufferedReader(new FileReader(f1));
            String str;
            ArrayList<String> list=new ArrayList<String>();
            while((str=reader.readLine()) !=null ){
                if(!str.isEmpty()){ list.add(str);
                    String[] find = str.split(" ");
                    int max = Integer.parseInt (find[0]);
                    for (int i = 0; i < find.length; i++) {
                        if (find[i]!="") {
                            int b = Integer.parseInt(find[i]);
                            if (b % 2 == 0) {
                                find[i] = null;
                            } } }
                    String[] paste = Arrays.stream(find).filter(Objects::nonNull).toArray(String[]::new);
                    f2.createNewFile();
                    try(FileWriter pisec = new FileWriter(f2)){
                        String someonelse = String.join(" ", paste);
                        pisec.write(someonelse);
                        pisec.flush();
                    } } }
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        } } }

