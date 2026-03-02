package br.edu.ifsp.maratona;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();

        char[] letras = in.toCharArray();
        String vogais = "";

        for (int i = 0; i < letras.length; i++)
        {
            if (letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i'
                || letras[i] == 'o' || letras[i] == 'u')
            {
                vogais += letras[i];
            }
        }

        char[] v = vogais.toCharArray();
        boolean ver = true;

        for (int i = 0; i < v.length / 2; i++)
        {
            if (v[i] != v[v.length - 1 - i])
            {
                ver = false;
                break;
            }
        }

        if (ver)
        {
            System.out.println("S");
        }
        else
        {
            System.out.println("N");
        }
    }
}