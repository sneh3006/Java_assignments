
//written by 21CE042
import java.util.*;

class Exp8{

    static int N = 9;

    // Function to check if all elements
// of the board[][] array store
// value in the range[1, 9]
    static boolean isinRange(int[][] board)
    {

        // Traverse board[][] array
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {

                // Check if board[i][j]
                // lies in the range
                if (board[i][j] <= 0 ||
                        board[i][j] > 9)
                {
                    return false;
                }
            }
        }
        return true;
    }

    // Function to check if the solution
// of sudoku puzzle is valid or not
    static boolean isValidSudoku(int board[][])
    {

           // Check if all elements of board[][]
        // stores value in the range[1, 9]
        if (isinRange(board) == false)
        {
            return false;
        }

        // Stores unique value
        // from 1 to N
        boolean[] unique = new boolean[N + 1];

        // Traverse each row of
        // the given array
        for(int i = 0; i < N; i++)
        {

            // Initialize unique[]
            // array to false
            Arrays.fill(unique, false);

            // Traverse each column
            // of current row
            for(int j = 0; j < N; j++)
            {

                // Stores the value
                // of board[i][j]
                int Z = board[i][j];

                // Check if current row
                // stores duplicate value
                if (unique[Z])
                {
                    return false;
                }
                unique[Z] = true;
            }
        }

        // Traverse each column of
        // the given array
        for(int i = 0; i < N; i++)
        {

            // Initialize unique[]
            // array to false
            Arrays.fill(unique, false);

            // Traverse each row
            // of current column
            for(int j = 0; j < N; j++)
            {

                // Stores the value
                // of board[j][i]
                int Z = board[j][i];

                // Check if current column
                // stores duplicate value
                if (unique[Z])
                {
                    return false;
                }
                unique[Z] = true;
            }
        }

        // Traverse each block of
        // size 3 * 3 in board[][] array
        for(int i = 0; i < N - 2; i += 3)
        {

            // j stores first column of
            // each 3 * 3 block
            for(int j = 0; j < N - 2; j += 3)
            {

                // Initialize unique[]
                // array to false
                Arrays.fill(unique, false);

                // Traverse current block
                for(int k = 0; k < 3; k++)
                {
                    for(int l = 0; l < 3; l++)
                    {

                        // Stores row number
                        // of current block
                        int X = i + k;

                        // Stores column number
                        // of current block
                        int Y = j + l;

                        // Stores the value
                        // of board[X][Y]
                        int Z = board[X][Y];

                        // Check if current block
                        // stores duplicate value
                        if (unique[Z])
                        {
                            return false;
                        }
                        unique[Z] = true;
                    }
                }
            }
        }

        // If all conditions satisfied
        return true;
    }

   
    public static void main(String[] args) {
        int[][] board = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

        if (isValidSudoku(board))
        {
            System.out.println("This sudoku solution is Valid");
        }
        else
        {
            System.out.println("Not Valid");
        }
    }
}