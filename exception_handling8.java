// Customized Exception using throws 

import java.util.*;

class UnderAgeException extends RuntimeException {
    UnderAgeException() {
        super("Sorry You Can't Vote"); // Description Message
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();
        if (age < 18) {
            throw new UnderAgeException();
        } else {
            System.out.println("You Are Elegible to Vote");
        }
    }
}

/*  OUTPUT: 
Enter Age
13
Exception in thread "main" UnderAgeException: Sorry You 
Can't Vote
        at Main.main(ex13.java:17)
PS D:\VS pros\JAVA-II> java Main
Enter Age
22
You Are Elegible to Vote
 */
