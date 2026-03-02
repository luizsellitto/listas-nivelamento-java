package br.edu.ifsp.maratona;
import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,c,m;

        n = sc.nextInt();
        c = sc.nextInt();
        m = sc.nextInt();

        int[] listC = new int[c];
        int[] listM = new int[m];

        for(int i=0; i<c; i++)
        {
            int in;
            in = sc.nextInt();
            listC[i] = in;
        }
        for(int i=0; i<m; i++)
        {
            int in;
            in = sc.nextInt();
            listM[i] = in;
        }

        int count=0;
//        int ver = 1;
        for(int i=0; i<listC.length; i++)
        {
//        ver = 1;
            for(int j=0; j<listM.length; j++)
            {
                if(listC[i] == listM[j])
                {
                    count++;
                    listC[i] = -1;
                }
//                    ver = 0;
            }
        }
        System.out.println(c - count);
//            if(ver == 0){
//                continue;
//            }
//            else
//            {
//                listC.
//            }
//        }
    }
}