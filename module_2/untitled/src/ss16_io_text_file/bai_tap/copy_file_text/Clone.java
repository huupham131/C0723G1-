package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;

public class Clone {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/macbook/Documents/GitHub/C0723G1-PhamThanhHuu/module_2/untitled/src/ss16_io_text_file/bai_tap/copy_file_text/source_file.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter("target_file.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = null;
            int count=0;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                count+= 1;
            }
            bufferedReader.close();
            bufferedWriter.close();
            System.out.println("Successful cloning");
            System.out.println("Number of cloned characters:" + count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
