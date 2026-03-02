package br.edu.ifsp.maratona;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matriz = new int[n][m];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                matriz[i][j] = sc.nextInt();
            }
        }
        int maior = 0;

        for(int i = 0; i < n; i++)
        {
            int soma = 0;
            for(int j = 0; j < m; j++)
            {
                soma += matriz[i][j];
            }
            if(soma > maior) maior = soma;
        }

        for(int j = 0; j < m; j++)
        {
            int soma = 0;
            for(int i = 0; i < n; i++)
            {
                soma += matriz[i][j];
            }
            if(soma > maior) maior = soma;
        }

        System.out.println(maior);
    }
}