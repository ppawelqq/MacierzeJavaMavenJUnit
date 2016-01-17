package pl.macierze.utils;

import java.util.Arrays;

public class Helpers {

    /**
     * Metoda pomocnicza (tworzy macierz) wywoływana przy każdej operacji.
     *
     * @param inputData dane wejsciowe macierzy
     * @param rows rozmiar macierzy wiersze
     * @param cols rozmiar macierzy kolumny
     *
     * @return matrix stworzona macierz
     */
    public static int[][] setMatrix(int[] inputData, int rows, int cols) {
        int matrix[][] = new int[rows][cols];
        int len = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = inputData[len];
                len++;
            }
        }
        return matrix;
    }

    /**
     * Metoda pomocnicza parsująca wprowadzone wartości macierzy w postaci
     * stringa do postaci tablicy która bedzie uzywana do wykonywania na niej
     * operacji
     *
     * @param inputData wejsciowy string macierzy
     *
     * @return parsedInput sparsowany string wejsciowy do postaci tablicy
     * macierzy
     */
    public static int[] parseInput(String inputData) {
        int[] parsedInput = new int[inputData.length()];

        for (int i = 0; i < inputData.length(); i++) {
            String str = Character.toString(inputData.charAt(i));
            parsedInput[i] = Integer.parseInt(str);
        }

        return parsedInput;

    }

    /**
     *
     * Metoda pomocnicza wypełniania tablicy macierzy
     *
     * @param array tablica wynikowa
     * @param element wprowadzny element
     * @return array tablica wynikowa
     */
    static int[] addElement(int[] array, int element) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;
        return array;
    }
}
