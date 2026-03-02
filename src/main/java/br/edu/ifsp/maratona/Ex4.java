package br.edu.ifsp.maratona;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int L = sc.nextInt();
        int C = sc.nextInt();
        int A = sc.nextInt() - 1;
        int B = sc.nextInt() - 1;

        int[][] matriz = new int[L][C];

        for(int i = 0; i < L; i++)
        {
            for(int j = 0; j < C; j++)
            {
                matriz[i][j] = sc.nextInt();
            }
        }

        int atualX = A;
        int atualY = B;
        int anteriorX = -1;
        int anteriorY = -1;

        while(true) {
            int proxX = -1;
            int proxY = -1;

            for(int i = 0; i < 4; i++) {
                int nx = atualX + dx[i];
                int ny = atualY + dy[i];

                if(nx >= 0 && nx < L && ny >= 0 && ny < C)
                {
                    if(matriz[nx][ny] == 1) {
                        if(nx != anteriorX || ny != anteriorY)
                        {
                            proxX = nx;
                            proxY = ny;
                        }
                    }
                }
            }
            if(proxX == -1)
            {
                break;
            }

            anteriorX = atualX;
            anteriorY = atualY;
            atualX = proxX;
            atualY = proxY;
        }
        System.out.println((atualX + 1) + " " + (atualY + 1));
    }
}