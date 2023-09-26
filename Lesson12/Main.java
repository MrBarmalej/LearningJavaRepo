package Lesson12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/*В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
Проанализировать и записать в другой файл самое длинное слово*/
public class Main {
String longest;
    public static void main(String[] args) {
        File file = new File("D://IT//Test/text.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] content = fileInputStream.readAllBytes();
            String text = new String(content, StandardCharsets.UTF_8);
            File file1 = new File("D://IT//Test/text1.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file1);

            String[] textNew = text.split(" ");
            for (int i = 0; i < textNew.length - 1; i++){
                for (int j = i + 1; j < textNew.length; j++){
                    int indexLongest = 0;
                    if (textNew[i].length() > textNew[i + 1].length() && textNew[indexLongest].length() < textNew[i].length()) {
                    indexLongest = i;
                    String longest = textNew[indexLongest];
                }
                }
            }
            fileOutputStream.write(content);

            System.out.println(Arrays.toString(content));




            fileInputStream.close();
            fileOutputStream.close();

        }
        catch (FileNotFoundException exception){
            System.out.println("File not found");
        }
        catch (IOException exception){
            System.out.println("Error when closing file");
        }




    }
}
