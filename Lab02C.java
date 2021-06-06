import java.util.Date;
import java.util.Scanner;

public class Lab02C {
    public static void main (String[] arg) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
            {
                a[i][j] = ((int)(Math.random() * 2 * n) - n);
                //a[i][j] = in.nextInt();
            }
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
        int k = 0;
        int[] min = new int[2*n];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
            {
                int b = 0;
                if(i != 0) {
                    if (j != 0)
                        if (a[i][j] >= a[i - 1][j - 1])
                            b = 1;
                    if (a[i][j] >= a[i - 1][j])
                        b = 1;
                    if(j != n-1)
                        if (a[i][j] >= a[i - 1][j + 1])
                            b = 1;
                }
                if (j != 0)
                    if(a[i][j] >= a[i][j-1])
                        b = 1;
                if(j != n-1)
                    if(a[i][j] >= a[i][j+1])
                        b = 1;
                if(i != n-1) {
                    if(j != 0)
                        if (a[i][j] >= a[i + 1][j - 1])
                            b = 1;
                    if (a[i][j] >= a[i + 1][j])
                        b = 1;
                    if(j != n-1)
                        if (a[i][j] >= a[i + 1][j + 1])
                            b = 1;
                }
                if(b == 0){k++; min[k -1] = a[i][j];}
            }
        }
        System.out.println("number of minimums = " + k);
        //System.out.println();
        for(int i = 0; i < k; i ++)
            System.out.print(min[i] + "\t");
        Date date = new Date();
        System.out.println();
        System.out.println("Liana Stavrova");
        System.out.println("Date of receipt: Mon Feb 8 15:00:00 MSK 2021");
        System.out.println("Date og assignment: " + date);
    }
}