package br.edu.ifsp.maratona;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();

        int[] valores = new int[n];
        for (int i = 0; i < n; i++)
        {
            valores[i] = sc.nextInt();
        }

        int lucro = 0;
        int lucroComAcao = -valores[0] - c;

        for (int i = 1; i < n; i++)
        {
            int novoLucro = (lucro > lucroComAcao + valores[i]) ? lucro : lucroComAcao + valores[i];
            int novolucroComAcao = (lucroComAcao > lucro - valores[i] - c) ? lucroComAcao : lucro - valores[i] - c;

            lucro = novoLucro;
            lucroComAcao = novolucroComAcao;
        }

        System.out.println(lucro);
    }
}