
import java.util.*;

class Cryptography// Creating a class named as Cryptography
{
    public void encrypt()// Creating a method for encryption
    {
        Scanner in = new Scanner(System.in);// Creating a scanner class object
        System.out.println("Enter any thing to encrypt it");

        String c = in.nextLine();

        int key = 9;// Key for encryption

        char[] chars = c.toCharArray();
        System.out.println("The encrypted form of \t" + c);

        for (char d : chars)// Creating a for-each loop
        {
            d -= key;
            System.out.print(d);
        }
        in.close();
    }

    public void decrypt()// Creating a method to decrypt
    {
        Scanner in = new Scanner(System.in);// Creating a scanner class object
        System.out.println("Enter anything to decrypt it");

        String c = in.nextLine();

        int key = 9;// Key for decryption

        char[] chars = c.toCharArray();
        System.out.println("The dcrypted form of \t " + c);
        for (char d : chars)// Creating a for-each loop
        {
            d += key;

            System.out.print(d);
        }
        in.close();
    }

    public void choice() {
        Scanner in = new Scanner(System.in);// Creating a scanner class object
        System.out.println("(1)To encrypt a msg\n(2)to dcrypt a msg");

        int choice = in.nextInt();
        switch (choice) {
            // A selection for encryption
            case 1:
                encrypt();
                break;

            // A selection for dcryption
            case 2:
                decrypt();
                break;

            // A default choice(choice of invalidity)
            default:
                System.out.println("Invalid choice");
                int row = 10;
                for (int i = 1; i <= row; i++) {
                    for (int j = 1; j <= row; j++) {
                        if ((i + j) % 2 == 0) {
                            System.out.print(" 0");
                        } else {
                            System.out.print(" 1");
                        }
                    }
                    System.out.println();
                }
                break;
        }
        in.close();
    }

}

public class Project_Cryptography {
    public static void main(String[] args) {
        Cryptography obj = new Cryptography();// Creating an object for cryptography class

        obj.choice();

    }

}
