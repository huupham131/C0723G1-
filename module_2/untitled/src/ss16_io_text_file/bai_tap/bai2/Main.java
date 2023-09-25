package ss16_io_text_file.bai_tap.bai2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        try {
//            Path path = Path.of("/Users/macbook/Documents/GitHub/C0723G1-PhamThanhHuu/module_2/untitled/src/ss16_io_text_file/bai_tap/bai2/data.txt");
//            List<String> dataList = Files.readAllLines(path);
//            System.out.format("%-5s %-15s %-15s\n",
//                    "STT",
//                    "CODE",
//                    "TEN");
//            for (String data : dataList) {
//                String[] dataArr = data.split(",");
//                Country country = new Country(Integer.valueOf(dataArr[0]), dataArr[1], dataArr[2]);
//                System.out.format("%-5s %-15s %-15s\n", country.getId(), country.getCode(), country.getName());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        // Cach 2:
        try {
            File file = new File("/Users/macbook/Documents/GitHub/C0723G1-PhamThanhHuu/module_2/untitled/src/ss16_io_text_file/bai_tap/bai2/data.txt");
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = null;
            System.out.format("%-5s %-15s %-15s\n", "STT", "CODE", "TEN");
            while ((line = bufferedReader.readLine()) != null) {
                String[] dataArr = line.split(",");
                Country country = new Country();
                for (String data : dataArr) {
                   country.setId(Integer.valueOf(dataArr[0]));
                   country.setCode(dataArr[1]);
                   country.setName(dataArr[2]);
                }
                bufferedReader.close();
                System.out.format("%-5s %-15s %-15s\n", country.getId(), country.getCode(), country.getName());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

