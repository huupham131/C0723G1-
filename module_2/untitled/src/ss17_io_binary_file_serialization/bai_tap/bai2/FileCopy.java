package ss17_io_binary_file_serialization.bai_tap.bai2;

import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        String sourcePath = "/Users/macbook/Documents/GitHub/C0723G1-PhamThanhHuu/module_2/untitled/src/ss17_io_binary_file_serialization/bai_tap/bai2/source_file.txt";
        String targetPath = "/Users/macbook/Documents/GitHub/C0723G1-PhamThanhHuu/module_2/untitled/src/ss17_io_binary_file_serialization/bai_tap/bai2/target_file.txt";
        File fileSource = null;
        File fileTarget = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            fileSource = new File(sourcePath);
            fileTarget = new File(targetPath);
            if(!fileSource.exists()){
                System.out.println("File not found!");
                return;
            }
            if(fileTarget.exists()) {
                Scanner sc = new Scanner(System.in);
                System.out.println("This file was existed. Overwrite this file ok? (ok/no)");
                String confirm = sc.nextLine();
                if (confirm.equals("ok")) {
                    fileTarget.delete();
                } else {
                    return;
                }
            }
            inputStream = new FileInputStream(fileSource);
            outputStream = new FileOutputStream(fileTarget);
            int i = -1;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("Count of bytes: "+ fileSource.length());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
