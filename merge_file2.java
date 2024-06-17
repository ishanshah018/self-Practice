// WAP to READ data from two files and WRITE to a third File (merge two files)

import java.io.*;

class practice {
    public static void main(String[] args) throws IOException {
        // Writes Data
        File f1 = new File("A.txt");
        FileWriter fw1 = new FileWriter(f1);
        BufferedWriter bw1 = new BufferedWriter(fw1);

        bw1.write("111");
        bw1.newLine();
        bw1.write("222");
        bw1.newLine();
        bw1.write("333");

        bw1.close();

        File f2 = new File("b.txt");
        FileWriter fw2 = new FileWriter(f2);
        BufferedWriter bw2 = new BufferedWriter(fw2);

        bw2.write("AAA");
        bw2.newLine();
        bw2.write("BBB");
        bw2.newLine();
        bw2.write("CCC");
        bw2.newLine();
        bw2.write("DDD");

        bw2.close();

        // Read Data

        File f11 = new File("A.txt");
        FileReader fr1 = new FileReader(f11);
        BufferedReader br1 = new BufferedReader(fr1);

        File f22 = new File("B.txt");
        FileReader fr2 = new FileReader(f22);
        BufferedReader br2 = new BufferedReader(fr2);

        File f3 = new File("C.txt"); // To store (write) merged data
        FileWriter fw3 = new FileWriter(f3);
        BufferedWriter bw3 = new BufferedWriter(fw3);

        String s = br1.readLine();
        String ss = br2.readLine();
        while (s != null || ss != null) {
            if (s != null) {
                bw3.write(s);
                bw3.newLine();
            }
            if (ss != null) {
                bw3.write(ss);
                bw3.newLine();
            }
            s = br1.readLine();
            ss = br2.readLine();
        }

        bw3.close();
        br1.close();
        br2.close();

    }
}

/*
 * OUTPUT OF C.TXT is:
 * 111
 * 222
 * 333
 * AAA
 * BBB
 * CCC
 */
