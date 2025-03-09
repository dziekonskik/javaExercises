import java.util.Arrays;

public class Transposition {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] transformed = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transformed[i][j] = arr[j][i];
            }
        }

        System.out.println(Arrays.deepToString(transformed));
    }


}
