package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFilePath="/Users/macbook/Documents/GitHub/C0723G1-PhamThanhHuu/module_2/untitled/src/ss16_io_text_file/bai_tap/copy_file_text/source_file.txt";
        String targetFilePath ="/Users/macbook/Documents/GitHub/C0723G1-PhamThanhHuu/module_2/untitled/src/ss16_io_text_file/bai_tap/copy_file_text/target_file.txt";
        try {
            File fileSource = new File(sourceFilePath);
            File fileTarget = new File(targetFilePath);
            if(!fileSource.exists()){
                System.out.println("File not found");
                return;
            }
            if(fileTarget.exists()){
                Scanner sc = new Scanner(System.in);
                System.out.println("This file was existed. Overwrite this file ok? (ok/no)");
                String confirm = sc.nextLine();
                if(confirm.equals("ok")) {
                    fileTarget.delete();
                }else{
                    return;
                }
            }
            FileReader fileReader = new FileReader(fileSource);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(fileTarget);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
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
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
