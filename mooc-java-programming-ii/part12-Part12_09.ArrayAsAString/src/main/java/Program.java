
public class Program {

    public static void main(String[] args) {
        // Test your method here

        // Task - 1
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));

        // Task - 2
        int[][] matrix2 = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };

        System.out.println(arrayAsString(matrix2));
    }

    public static String arrayAsString(int[][] array) {
        String ans = "";
        for (int i = 0; i < array.length; i++) {
            StringBuilder str = new StringBuilder();
            for(int j = 0; j < array[i].length; j++){
                str.append(array[i][j]);
            }
            ans += str.toString() + "\n";
        }
        return ans;
    }

}
