package br.edu.ifsp.list02;

/*
    Leia um conjunto de cinco números inteiros não repetidos em uma única linha e os armazene em um vetor de 10 posições.
    A partir daí, leia um número por vez. Se o número ainda não estiver no conjunto, faça a inclusão após o último número.
    Caso ele esteja no conjunto, remova o número e libere espaço no array. A cada iteração imprima o vetor. O programa
    acaba quando o array ficar totalmente cheio ou vazio. Veja o exemplo na imagem anexa.

    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
 */
public class Ex03 {
    public static void main(String[] args) {
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui
    }

    String compute(int[] firstFive, int[] otherInts) {
        String output = "";
        int[] vetor = new int[10];
        int tamanho = 0;

        if (firstFive == null || firstFive.length != 5)
        {
            return "Erro";
        }

        for (int i = 0; i < 5; i++)
        {
            for (int j = i + 1; j < 5; j++)
            {
                if (firstFive[i] == firstFive[j])
                {
                    return "Erro";
                }
            }
        }

        for (int i = 0; i < 5; i++)
        {
            vetor[i] = firstFive[i];
            tamanho++;
        }

        for (int i = 0; i < tamanho; i++)
        {
            output += vetor[i];
            if (i < tamanho - 1)
            {
                output += " ";
            }
        }
        output += "\n";

        for (int k = 0; k < otherInts.length; k++)
        {
            int num = otherInts[k];
            boolean encontrado = false;
            int pos = -1;

            for (int i = 0; i < tamanho; i++)
            {
                if (vetor[i] == num)
                {
                    encontrado = true;
                    pos = i;
                    break;
                }
            }

            if (encontrado)
            {
                for (int i = pos; i < tamanho - 1; i++)
                {
                    vetor[i] = vetor[i + 1];
                }
                tamanho--;
            } else {
                if (tamanho >= 10)
                {
                    return "Erro";
                }
                vetor[tamanho] = num;
                tamanho++;
            }

            for (int i = 0; i < tamanho; i++)
            {
                output += vetor[i];
                if (i < tamanho - 1)
                {
                    output += " ";
                }
            }
            output += "\n";

            if (tamanho == 0 || tamanho == 10)
            {
                break;
            }
        }

        return output.trim();
    }
}