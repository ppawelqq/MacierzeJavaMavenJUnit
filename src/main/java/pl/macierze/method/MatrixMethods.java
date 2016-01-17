package pl.macierze.method;

public class MatrixMethods {

    int[][] firstMatrix;
    int[][] secondMatrix;
    int rows;
    int cols;
    int[][] sum;
    int[][] div;
    int[][] multi;
    int[][] sub;

    /**
     * Konstruktor klasy
     *
     * @param firstMatrix przekazana macierz pierwsza
     * @param secondMatrix przekazana macierz druga
     * @param rows liczba wierszy
     * @param cols liczba kolumn
     */
    public MatrixMethods(int[][] firstMatrix, int[][] secondMatrix, int rows, int cols) {
        this.firstMatrix = firstMatrix;
        this.secondMatrix = secondMatrix;
        this.rows = rows;
        this.cols = cols;

    }

    /**
     *
     * @return
     */
    public String add() {
        String score = "";
        sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        System.out.println("\n\npo dodaniu macierzy: ");
        score = score.concat("\n\npo dodaniu macierzy: \n");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print("\t" + sum[i][j]);
                score = score.concat("\t " + sum[i][j]);
            }
            score = score.concat("\n");
            System.out.println();
        }
        return score;
    }

    /**
     *
     * @return
     */
    public String div() {
        String score = "";
        div = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                System.out.println(firstMatrix[i][j]);
                div[i][j] = firstMatrix[i][j] / secondMatrix[i][j];
            }
        }

        System.out.println("\n\npo dzieleniu macierzy: \n");
        score = score.concat("\n\npo dzieleniu macierzy: \n");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print("\t" + div[i][j]);
                score = score.concat("\t " + div[i][j]);
            }
            score = score.concat("\n");
            System.out.println();
        }
        return score;
    }

    /**
     *
     * @return
     */
    public String multi() {
        String score = "";
        multi = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                multi[i][j] = firstMatrix[i][j] * secondMatrix[i][j];
            }
        }

        System.out.println("\n\npo mnożeniu macierzy : \n");
        score = score.concat("\n\npo dzieleniu macierzy: \n");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print("\t" + multi[i][j]);
                score = score.concat("\t " + multi[i][j]);
            }
            score = score.concat("\n");
            System.out.println();
        }
        return score;
    }

    public String sub() {
        String score = "";
        sub = new int[rows][cols];
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                sub[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
            }
        }

        System.out.println("\n\npo odejmowaniu macierzy :\n");
        score = score.concat("\n\npo odejmowaniu macierzy :\n");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print("\t" + sub[i][j]);
                score = score.concat("\t " + sub[i][j]);
            }
            score = score.concat("\n");
            System.out.println();
        }
        return score;
    }

}
