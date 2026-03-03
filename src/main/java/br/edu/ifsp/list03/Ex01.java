package br.edu.ifsp.list03;

/*
Implemente um programa que gere senhas provisórias a partir do nome do usuário, seguindo o mesmo
padrão dos exemplos a seguir:

EXEMPLO 1 Entrada: Java | Saída: J*Ja*Jav*Jav*Ja* J
EXEMPLO 2 Entrada: POOS3 | Saída: P*PO*POO*POOS*POOS*POO*PO*P
EXEMPLO 3 Entrada: KO | Saída: K*K
EXEMPLO 4 Entrada: O | Saída: Invalido
EXEMPLO 5 Entrada: | Saída: Invalido
*/
public class Ex01 {
    public static void main(String[] args) {
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui
    }

    String compute(String input) {
        if (input == null || input.length() <= 1)
        {
            return "Invalido";
        }
        /*Outras maneiras de resolver (substring e temp), maneira mais simples seria com substring*/
//        StringBuilder output = new StringBuilder();
//        char[] letras = input.toCharArray();
//        String temp = "";
//
//        for (int i = 0; i < input.length()-1; i++)
//        {
//            temp += String.format("%c", letras[i]);
//            output.append(temp).append("*");
////            output += input.substring(0, i) + "*";
//        }
//
//        for (int i = input.length() - 1; i >= 1; i--)
//        {
//            output.append(input, 0, i);
//            if (i > 1)
//            {
//                output.append("*");
//            }
//        }
        StringBuilder output = new StringBuilder();
        char[] letras = input.toCharArray();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < input.length() - 1; i++)
        {
            temp.append(letras[i]);
            output.append(temp).append("*");
        }

        temp.append(letras[input.length() - 1]);

        for (int i = input.length(); i > 0; i--)
        {


            if (i > 1 && i != input.length())
            {
                output.append("*");
            }

            temp.setLength(temp.length() - 1);
            output.append(temp);
        }
        return output.toString();
    }
}