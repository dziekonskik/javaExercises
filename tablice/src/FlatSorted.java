public class FlatSorted {
    public static void main(String[] args) {
        int[][] chaos = {{12, 23, 214, 1, 345, 233}, {3, 23, 4, 5, 6}, {754, 77, 754, 777, 4, 3, 775}};

        int arrLen = 0;
        for (int[] row : chaos) {
            arrLen += row.length;
        }

        int[] sortedArray = new int[arrLen];
        int currentIndex = 0;
        for (int i = 0; i < chaos.length; i++) {
            for (int j = 0; j < chaos[i].length; j++) {
                sortedArray[currentIndex] = chaos[i][j];
                currentIndex++;
            }
        }

        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - 1 - i; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                }
            }
        }
    }
}
