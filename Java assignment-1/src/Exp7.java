//written by 21CE042
public class Exp7 {
    public static void main(String[] args) {
        String[] ans = { "D", "B", "D", "C", "C", "D", "A", "E", "A", "D" }; //array of right answers 
        
        String[][] stu = { { "A", "B", "A", "C", "C", "D", "E", "E", "A", "D" },//array of student's answers 
                { "D", "B", "A", "B", "C", "A", "E", "E", "A", "D" },
                { "E", "D", "D", "A", "C", "B", "E", "E", "A", "D" },
                { "C", "B", "A", "E", "D", "C", "E", "E", "A", "D" },
                { "A", "B", "D", "C", "C", "D", "E", "E", "A", "D" },
                { "B", "B", "E", "C", "C", "D", "E", "E", "A", "D" },
                { "B", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
                { "E", "B", "E", "C", "C", "D", "E", "E", "A", "D" } };
        int count = 0;
        int l = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {

                if (ans[i] == stu[j][i]) {//compares actual answers to students answers 
                    count++;
                }
            }

            System.out.print("Student" + l + ":");//printing output for every student
            l = l + 1;
            System.out.println(count);
            count = 0;
        }

    }
}