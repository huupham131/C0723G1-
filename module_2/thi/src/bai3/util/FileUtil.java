package bai3.util;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {


    public static List<String> readFile(String path) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(path);
            if (!(file.exists())) {
                System.out.println("File not found");
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            List<String> stringList = new ArrayList<>();
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                stringList.add(string);
            }
            return stringList;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void writeFile(String path, List<String> stringList , boolean flag) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(path);

            fileWriter = new FileWriter(file, flag);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
