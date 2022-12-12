import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;

public class WSB {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new FileInputStream("comments_2021-1-1_2021-11-29_new.csv"));

        while (input.hasNext()) {
            String string = input.next();
            string = string.replaceAll("[^a-zA-Z0-9 .,]|(?<!\\d)[.,]|[.,](?!\\d)", "");

            if (string.contains("https")) {
                string = string.replaceAll(string, " ");
            }
            System.out.print(string + " ");

        }
    }


}
