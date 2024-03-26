import java.io.FileNotFoundException;
import java.io.FileReader;

class read {
    void read() throws FileNotFoundException {
        FileReader f = new FileReader("D:/abc.txt");
    }
}

class Main {
    public static void main(String[] args) {
        read r = new read();
        try {
            r.read();
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
