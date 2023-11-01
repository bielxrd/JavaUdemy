import java.util.*;

public class App {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Informe o tamanho da matriz");
        int n = ler.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = ler.nextInt();

            }
        }
        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
        int contador = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] < 0) {
                    contador++;
                }

            }
        }
        System.out.println("Negative numbers: "+contador);

    }
}
