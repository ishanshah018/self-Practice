//Checked Exception

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader f = new FileReader("D:/abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("Hello");
    }
}

/*
java.io.FileNotFoundException: D:\abc.txt (The system cannot find the file specified)
Hello
 */
