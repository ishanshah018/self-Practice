
/*
Write a Java program that takes a filename as a command-line argument.
The program should analyze a text file located in the abc folder on drive E:. If the file exists, the program performs the following:

->Display the total number of words and characters in the  file.
Reads the file content line by line.
Splits each line into words.
->Store all the words in an ArrayList<String>.
->Sorts the ArrayList containing words in natural order (alphabetical order).
->Creates a new file named "sorted_words.txt" and writes each word from the sorted ArrayList to this file, one word per line.
 */
import java.io.*;
import java.util.*;

class prog {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\", "DBMS self");
        File[] f1 = f.listFiles();
        ArrayList<String> al = new ArrayList<String>();

        int WordCount = 0;
        int CharacterCount = 0;

        for (File ff1 : f1) {
            System.out.println(ff1.getName());
            String s = ff1.getName(); // will make a list of names of file and stores it in s
            if (s.equals(args[0] + ".txt")) {
                FileReader fr = new FileReader(ff1);
                BufferedReader bfr = new BufferedReader(fr);

                String line = bfr.readLine(); // will read line by line of that file(of user entered)

                while (line != null) {
                    String[] ss = line.split("\\s+"); // will split lines to each words

                    for (String ss1 : ss) {
                        WordCount++; // Counts each words
                        CharacterCount = CharacterCount + ss1.length(); // Counts each Characters in words

                        String newword = ""; // To store

                        // for (int i = 0; i < ss1.length(); i++) {
                        // if ((ss1.charAt(i) >= 65 && ss1.charAt(i) <= 90)
                        // || (ss1.charAt(i) >= 97 && ss1.charAt(i) <= 122))
                        // newword = newword + ss1.charAt(i);
                        // }  // to remove commas and other letters
                        newword = newword + ss1;
                        al.add(newword);
                    }
                    line = bfr.readLine();

                }
            }
        }

        System.out.println(al);
        Collections.sort(al);
        System.out.println("AFTER SORTING: ");
        System.out.println(al);

        FileWriter fw = new FileWriter("Updated.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for (String a : al) {
            bw.write(a);
            bw.newLine();
        }

        System.out.println("Total Words: " + WordCount);
        System.out.println("Total Characters: " + CharacterCount);
        bw.close();
    }
}
