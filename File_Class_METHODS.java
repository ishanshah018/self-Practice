import java.io.File;
import java.io.IOException;

class File1 {
    public static void main(String[] args) throws IOException {

        // Creating Directory using File Class

        File f1 = new File("IS1810");
        System.out.println(f1.exists());

        f1.mkdir();
        System.out.println(f1.exists());

        File f2 = new File("IS1810", "XY1234");
        f2.mkdir();

        // Creating f3 file
        File f3 = new File("abc.txt");
        f3.createNewFile(); // we have to make throws if .txt extension not exists

        // Creating f4 file in f1 directory
        File f4 = new File("IS1810", "xyz.txt");
        f4.createNewFile();

        // Creating a file in D: drive \\ fileio folder
        File f5 = new File("D:\\VS pros\\fileio\\IS1810\\XY1234", "pqr.txt");
        f5.createNewFile();

        System.out.println(f4.getPath());
        System.out.println(f5.getPath());

        System.out.println(f4.getAbsolutePath());
        System.out.println(f4.getParent());

        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());

        System.out.println(f1.canRead());
        System.out.println(f1.canWrite());

        System.out.println(f4.canExecute());

        System.out.println(f3.length());

        File f6 = new File("abc.txt");
        System.out.println(f3.equals(f6)); // bcoz f6 also refers abc.txt which is already of f3
        System.out.println(f3.equals(f2));

        
    }
}
