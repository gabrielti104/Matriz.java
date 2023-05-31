
package exemplo1;
import java.util.Scanner;

public class Exemplo1 {
    
    public static int[]tamanhoMatriz(){
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[2];
        System.out.println("Linhas: ");
        vetor[0] = input.nextInt();
        System.out.println("Colunas: ");
        vetor[1] = input.nextInt();
        return vetor;
    }
    
    public static int[][] criarMatriz(int[] vetor){
        Scanner input = new Scanner (System.in);
        int [][] matriz = new int [vetor [0]] [vetor[1]];
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
                System.out.printf("matriz[%d][%d]:\n", i,j);
                matriz[i][j] = input.nextInt();
            }
        }
        return matriz;
    }
    
    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz[i].length; j++) {
                System.out.printf("matriz[%d][%d]: %d", i,j,matriz[i][j]);
            }
        }
    }
    
    public static void main(String[] args) {
        int[] v = tamanhoMatriz();
        int[][] m = criarMatriz(v);
        imprimirMatriz(m);
    }
    
}
