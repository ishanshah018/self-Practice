// WAP TO LIST FILES & DIRECTORIES IN PARTICULAR FOLDER OF DRIVE AND COUNT NO.OF FILES AND DIRECTORIES

import java.io.*;

class LIST1 {
    public static void main(String[] args) {
        int FileCount = 0;
        int DirectoryCount = 0;

        File f = new File("D:\\", "DBMS self");
        File[] ff = f.listFiles();

        for (File ff1 : ff) {
            System.out.println(ff1);

            if (ff1.isFile()) {
                FileCount++;
            }
            if (ff1.isDirectory()) {
                DirectoryCount++;
            }
        }

        System.out.println("Total Files: " + FileCount);
        System.out.println("Total Directories: " + DirectoryCount);
    }
}
