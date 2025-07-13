import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        int[][] teams = {
                { 45, 31, 24, 22, 20, 17, 14, 13, 12, 10 },
                { 31, 18, 15, 12, 10, 8, 6, 4, 2, 1 },
                { 51, 30, 10, 9, 8, 7, 6, 5, 2, 1 }
        };

        int[] nationalTeam = mergeAll(teams);
        System.out.println(Arrays.toString(nationalTeam)); // [51, 45, 31, 31, 30, 24, 22, 20, 18, 17]
    }

    /** Метод для слияния всех команд в одну национальную */
    public static int[] mergeAll(int[][] teams) {
        int[] result = teams[0]; // стартуем с первой команды
        for (int i = 1; i < teams.length; i++) {
            result = merge(result, teams[i]);
        }
        return result;
    }

    /** Метод для слияния двух команд в одну */
    public static int[] merge(int[] teamA, int[] teamB) {
        int[] merged = new int[10];
        int i = 0, j = 0, k = 0;
        // Массивы упорядочены по убыванию
        while (k < 10) {
            if (i < teamA.length && (j >= teamB.length || teamA[i] >= teamB[j])) {
                merged[k++] = teamA[i++];
            } else {
                merged[k++] = teamB[j++];
            }
        }
        return merged;
    }
}
