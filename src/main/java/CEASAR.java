import java.util.Scanner;

public class CEASAR {

    public static void main(String[] args) {

        System.out.println("Enter the word to be encrypted");
        Scanner bene = new Scanner(System.in);
        String CipherText = bene.nextLine();
        System.out.println("Enter a key you want to use");
        int word = bene.nextInt();
        String encrypted = Encrypt .Encry(CipherText, word);
        System.out.println(encrypted);


        System.out.println("Enter the word to be decrypted");
        Scanner input = new Scanner(System.in);
        String received= input.nextLine();
        System.out.println("Enter a key you want to use");
        int output = input .nextInt();
        String decrypted= Decrypt .Decry(received, output);
        System.out.println(decrypted);

    }
}