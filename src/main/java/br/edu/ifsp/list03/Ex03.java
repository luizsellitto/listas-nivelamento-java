package br.edu.ifsp.list03;

/*
Dada uma String arbitrária, faça um programa que imprima “Sim” se essa for palíndromo e “Nao”, caso contrário.
Palíndromo é uma frase ou palavra que pode ser lida, indiferentemente, da esquerda para a direita ou vice-versa.
Por exemplo, “arara” é um palíndromo. Considere como entrada apenas palavras com letras minúsculas.
 */
public class Ex03 {
    public static void main(String[] args) {
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui
    }

    String compute(String input) {
        String invertida = "";
        if (input == null)
        {
            return "Sim";
        }
        for (int i = input.length() - 1; i >= 0; i--) {
            invertida += input.charAt(i);
        }

        if (input.equals(invertida)) {
            return "Sim";
        }
        else
        {
            return "Nao";
        }
    }
}