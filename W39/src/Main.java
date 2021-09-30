import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    private static String[] text;
    private static int mostUsedLetter;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

      //  printWordsStartingWith("Ø");

      //  printWordsOfLength(3);


        //test dine metoder ved at kalde dem her:
        //Task One
        //printLongestWord();
        //Task One?
        //printWordsWithLessThanTwoVocals();
        //Task Two
        //printFirstHalfOfEachWord();
        //Task Threee
        printMostFrequentLetter();
        //Task Four
        printLessFrequentLetter();

    }

    private static void printWordsOfLength(int l) {
        boolean wordisvalid = true;

        for (String s : text) {
            if (s.length() == l) {
                if (s.contains(",") || s.contains(".")) {
                    wordisvalid = false;
                }

                if (wordisvalid) {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:

    private static void printLongestWord() {
        int lengthOfWord = 0;
        String longestWord = " ";
        for (String word : text) {
            if (word.length() > lengthOfWord) {
                lengthOfWord = word.length();
                longestWord = word;
            }
        }
        System.out.println("The longest word is " + longestWord + "and its length is " + lengthOfWord);

    }
/*
    public static boolean printWordsWithLessThanTwoVocals(char vocal);
    int vocalStart = 0;

    if (vocal=='a'||vocal=='A'||vocal=='e'||vocal=='E'||vocal=='i'||vocal=='I'||vocal=='o'||vocal=='O'||vocal=='u'||vocal=='U'||vocal=='y'||vocal=='Y'||vocal=='æ'||vocal=='Æ'||vocal=='ø'||vocal=='Ø'||vocal=='å'vocal=='Å'){
        return true;

 */

    public static void printFirstHalfOfEachWord(){

        for (String s : text) {
            s = s.substring(0,s.length()/2);
            System.out.println(s);
        }
    }

    //task 3 - method that prints the most used letter in all of data.txt
    private static void printMostFrequentLetter() {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "æ", "ø", "å"};
        int[] timesUsed = new int[29];
        for(String s : text) {
            for (int i = 0 ; i < s.length() ; i++){
                for (int j = 0 ; j < letters.length ; j++) {
                    if (String.valueOf(s.charAt(i)).equalsIgnoreCase(letters[j])) {
                        timesUsed[j]++;
                    }
                }
            }
        }
        /* print how many times each letter is used
        for(int i = 0 ; i < letters.length ; i++) {
            System.out.println(letters[i] + " has been used " + timesUsed[i]);
        }*/

        int mostUsed = 0;
        int indexOfMostUsed = 0;
        for(int i = 0 ; i < timesUsed.length ; i++) {
            if (timesUsed[i] > mostUsed) {
                mostUsed = timesUsed[i];
                indexOfMostUsed = i;
            }
        }
        mostUsedLetter = mostUsed;
        System.out.println(letters[indexOfMostUsed] + " has been used " + mostUsed);
    }

    //task 4 - method that prints the most used letter in all of data.txt
    private static void printLessFrequentLetter() {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "æ", "ø", "å"};
        int[] timesUsed = new int[29];
        for(String s : text) {
            for (int i = 0 ; i < s.length() ; i++){
                for (int j = 0 ; j < letters.length ; j++) {
                    if (String.valueOf(s.charAt(i)).equalsIgnoreCase(letters[j])) {
                        timesUsed[j]++;
                    }
                }
            }
        }

        int leastUsed = mostUsedLetter;
        int indexOfLeastUsed = 0;
        for(int i = 0 ; i < timesUsed.length ; i++) {
            if (timesUsed[i] <= leastUsed) {
                leastUsed = timesUsed[i];
                indexOfLeastUsed = i;
            }
        }
        System.out.println(letters[indexOfLeastUsed] + " has been used " + leastUsed);
    }
}