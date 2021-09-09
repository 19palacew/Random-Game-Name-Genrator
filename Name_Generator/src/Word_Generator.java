import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Word_Generator {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] verbs = wordList("Verbs.txt");
        String[] nouns = wordList("Nouns.txt");
        String[] adjectives = wordList("Adjectives.txt");
        System.out.println(adjectives[rand.nextInt(adjectives.length)] + " " + nouns[rand.nextInt(nouns.length)] + " " + verbs[rand.nextInt(verbs.length)]);
    }

    public static String[] wordList(String str){
        String[] temp = new String[0];
        ArrayList<String> list = new ArrayList<>();
        try {
            File myObj = new File(str);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                list.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return list.toArray(temp);
    }
}
