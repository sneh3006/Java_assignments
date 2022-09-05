import java.util.*;

class Marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float grade[] = new float[9];
        float credit[] = new float[] { 3, 2, 2, 2, 2, 4, 3, 1, 2 };
        int backlog = 0;
        String subject[] = new String[] { "CE144T", "CE144P", "CL144.02", "FS102A", "HS205.02", "MA144", "ME145T",
                "ME145P", "PY143" };
        String charc[] = new String[9];
        for (int i = 0; i < 9; i++) {
            float marks;
            marks = sc.nextInt();
            if (marks >= 80) {
                grade[i] = 10;
                charc[i] = "AA";
            } else if (marks >= 73 && marks < 80) {
                grade[i] = 9;
                charc[i] = "AB";

            } else if (marks >= 66 && marks < 73) {
                grade[i] = 8;
                charc[i] = "BB";
            } else if (marks >= 60 && marks < 66) {
                grade[i] = 7;
                charc[i] = "BC";
            } else if (marks >= 55 && marks < 60) {
                grade[i] = 6;
                charc[i] = "CC";
            } else if (marks >= 50 && marks < 55) {
                grade[i] = 5;
                charc[i] = "CD";
            } else if (marks >= 45 && marks < 50) {
                grade[i] = 4;
                charc[i] = "DD";
            } else if (marks < 45) {
                grade[i] = 00;
                charc[i] = "FF";
                backlog += 1;
            }
        }
        float sum = 0;
        float sweggs = 0;
        for (int i = 0; i < 9; i++) {
            sum = sum + credit[i];
            sweggs = sweggs + (credit[i] * grade[i]);
        }
        for (int i = 0; i < 9; i++) {
            System.out.println("Grade of " + subject[i] + " :" + charc[i]);
        }
        System.out.println("SGPA :" + sweggs / sum);
        System.out.println("NO. of Backlog :" + backlog);

    }
}
