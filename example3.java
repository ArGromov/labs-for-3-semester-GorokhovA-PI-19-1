package com.company;
import java.util.Arrays;
import java.io.*;

public class example3 {

    public static void readAllByArray(InputStream in) throws IOException {
        byte [] buff = new byte[5];
        while (true) {
            int count = in.read(buff);
            if (count != -1) {
                System.out.println("количество = " + count + ", buff = " + Arrays.toString(buff) + ", str = "
                        + new String(buff, 0, count,"cp1251" ));
            } else {
                break;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        String fileName = "D:\\textforexample3.txt";
        InputStream inFile = null;
        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);

        } catch (IOException e) {
            System.out.println("Ошибка открытия-закрытия файла " + fileName +e);
        } finally {
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {
                }
            } }}
}
