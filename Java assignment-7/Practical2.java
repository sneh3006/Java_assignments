
//PREPARED BY 21CE042 Sneh Jani
// Write a program that counts the occurrences of words in a text and displays the words
// and their occurrences in alphabetical order of the words. Using Map and Set Classes.
// import java.io.*;

public class Practical2 {

    static int countOccurrences(String str, String word) {
        // split the string by spaces in a
        String a[] = str.split(" ");

        // search for pattern in a
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            // if match found increase count
            if (word.equals(a[i]))
                count++;
        }

        return count;
    }

    // Driver code
    public static void main(String args[]) {
        String str = "GeeksforGeeks A computer science portal for geeks ";
        String word = "portal";
        System.out.println(countOccurrences(str, word));
    }
}