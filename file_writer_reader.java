import java.io.*;

// IN FILEWRITER WE CAN WRITE ANY TYPE OF DATA
class FileWriter1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("fw.txt");
        fw.write(65);
        fw.write("\n");
        fw.write("ishan");
        fw.write("\n");
        fw.write('a');
        fw.write("\n");

        char[] ch = { 'a', 'b', 'p', 'q' };
        fw.write(ch);

        fw.flush();
        fw.close();

        FileReader fr = new FileReader("fw.txt");

        int i = fr.read();
        while (i != -1) {
            System.out.println((char)i);
            i = fr.read();
        }
    }
}
