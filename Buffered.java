import java.io.*;

import javax.annotation.processing.FilerException;

class BFWR {
    public static void main(String[] args) throws IOException {

        // BUFFEREDWRITER

        File f = new File("bfr.txt");
        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(97);
        bw.newLine();
        bw.write(98);
        bw.newLine();
        bw.write('a');
        bw.newLine();
        bw.write("Ishan");
        bw.newLine();
        bw.write("Shah");
        bw.newLine();
        char[] ch = { 'a', 'b', 'c' };
        bw.write(ch);
        bw.newLine();

        bw.flush();
        bw.close();

        // BUFFEREDREADER

        File f1 = new File("bfr.txt");
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);

        String s = br.readLine();

        while (s != null) {
            System.out.println(s);
            s = br.readLine();
        }

    }
}
