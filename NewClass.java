package relogio;

import java.io.PrintStream;
import java.util.Scanner;

public class NewClass {

    public static int[] tamanhoMatriz() {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[2];
        System.out.println("Linhas: ");
        vetor[0] = entrada.nextInt();
        System.out.println("Colunas: ");
        vetor[1] = entrada.nextInt();
        return vetor;
    }

    public static int[][] criarMatriz(int[] vetor) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[vetor[0]][vetor[1]];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                PrintStream printf = System.out.printf("matriz[%d][%d]:\n", i, j);
                matriz[i][j] = entrada.nextInt();
            }
        }
        return matriz;
    }
    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("matriz [%d][%d] %d", i, j, matriz[i][j]);
            }
    }
   
    }
    public static void main(String[] args){
        int [] v =tamanhoMatriz();
        int [][] m = criarMatriz(v);
        imprimirMatriz(m);
    }
}
