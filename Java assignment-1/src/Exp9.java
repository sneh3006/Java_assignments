//written by 21CE042
import java.util.Scanner;

public class Exp9
{
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";//og alphabet reference

    public static String encrypt(String plainText, int shiftchar)//fuction to encrypt data
    {
        plainText = plainText.toLowerCase();//turning plain text to lowercase 
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(plainText.charAt(i));
            int keyVal = (shiftchar + charPosition) % 26;//shifting character positions 
            char replaceVal = ALPHABET.charAt(keyVal);//replacing values of alphabet with keyvalues
            cipherText += replaceVal;//creating cypher text
        }
        return cipherText;
    }

    public static String decrypt(String cipherText, int shiftchar)
    {
        cipherText = cipherText.toLowerCase();//changing text to lowercase
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - shiftchar) % 26;//shifting character position to original
            if (keyVal < 0)
            {
                keyVal = ALPHABET.length() + keyVal;//getting original vlaes of character 
            }
            char replaceVal = ALPHABET.charAt(keyVal);//replacing character 
            plainText += replaceVal;//getting plain text back 
        }
        return plainText;
    }

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String for Encryption: ");
    String message = new String();//String input for user
    message = sc.nextLine();
    System.out.println(encrypt(message, 3));//fuction call to encrypt message 
    System.out.println(decrypt(encrypt(message, 3), 3));//fuction call to decrypt
    sc.close();
   }
}
