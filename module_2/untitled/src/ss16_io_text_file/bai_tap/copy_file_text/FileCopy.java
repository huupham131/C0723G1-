package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        String sourceFilePath = "/Users/macbook/Documents/GitHub/C0723G1-PhamThanhHuu/module_2/untitled/src/ss16_io_text_file/bai_tap/copy_file_text/source_file.txt";
        String targetFilePath = "/Users/macbook/Documents/GitHub/C0723G1-PhamThanhHuu/module_2/untitled/src/ss16_io_text_file/bai_tap/copy_file_text/target_file.txt";
        File fileSource = null;
        File fileTarget = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileSource = new File(sourceFilePath);
            fileTarget = new File(targetFilePath);
            if (!fileSource.exists()) {
                System.out.println("File not found");
                return;
            }
            if (fileTarget.exists()) {
                Scanner sc = new Scanner(System.in);
                System.out.println("This file was existed. Overwrite this file ok? (ok/no)");
                String confirm = sc.nextLine();
                if (confirm.equals("ok")) {
                    fileTarget.delete();
                } else {
                    return;
                }
            }
            fileReader = new FileReader(fileSource);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(fileTarget);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = null;
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                count += line.length();
            }
            bufferedReader.close();
            bufferedWriter.close();
            System.out.println("Successful cloning");
            System.out.println("Number of cloned characters:" + count);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileReader != null) {
                    fileReader.close();
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
