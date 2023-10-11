package Test;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public List<String> readFile(String path){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            File file = new File(path);
            if(!file.exists()){
                System.out.println("File not found");
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String string;
            List<String> strings = new ArrayList<>();
            while ((string= bufferedReader.readLine())!=null){
                strings.add(string);
            }
            return strings;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException("Loi dmcm");
        }
    }
    public void writeFile(List<String> strings, String path){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            File file = new File(path);
            if(!file.exists()){
                System.out.println("File not found");
            }
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for(String s : strings){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }

    } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {

        }
        }
    }
