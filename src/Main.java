import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("src/Урок 6. Collections Framework (скачан).txt");
        String[] words = null;
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String s;
        String input = "Страдание";
        int count = 0;
        while ((s = br.readLine()) != null); {

            for (String word : words) {
                if (word.equals(input)) {
                    count++;
                }
            }
        }
        if(count!=0) {
            System.out.println("Слово страдание присутствует в файле в течение "+count+ " раз");
        }
        else {
            System.out.println("Слово страдание отсутствует в файле");
        }

        fr.close();



       int a =1;
       int b =1;
       while (a<11){
           while (b<11){
               System.out.print(a*b + " ");
               b++;
           }
           System.out.println();
           a++;
           b=1;

       }

    }


}
