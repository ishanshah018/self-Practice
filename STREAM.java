import java.io.*;

class Stream1 {
    public static void main(String[] args) throws IOException {
        // DATA-WRITE

        FileOutputStream fos = new FileOutputStream("fos.txt");
        fos.write(98);
        // fos.write("ishan"); //cannot write string data directly as it is write(int)
        // function..

        String s = "haskar";
        byte[] b = s.getBytes(); // Converts String to Byte

        fos.write(b);

        // DATA-READ

        FileInputStream fis = new FileInputStream("fos.txt");

        int i = fis.read();

        while (i != -1) {
            System.out.print((char) i);
            i = fis.read();
        }

    }
}
