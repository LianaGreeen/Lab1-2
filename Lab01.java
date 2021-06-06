import java.util.Scanner;

public class Lab01 {
    public static void main (String[] arg)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of massive: ");
        int size = in.nextInt();
        int n = 0;
        int [] number = new int[size];
        for(int i = 0; i < size; i++) {
            //number[i] = -2;
            number[i] = ((int) (Math.random() * size) - (size/4));
            System.out.print(number[i] + "\t");
        }
        System.out.println();
        System.out.println();
        for(int i = 0; i < size; i++)
        {
            if(number[i] > 0)
            {
                n = number[i];
                break;
            }
        }
        if (n != 0) {
            int[][] t = new int[n + 1][n + 1];
            for (int i = 0; i < n + 1; i++)
                for (int j = 0; j < n + 1; j++) {
                    if (i == 0 || j == 0)
                        t[i][j] = 1;
                    else {
                        if (i + j > n)
                            t[i][j] = 0;
                        else t[i][j] = t[i][j - 1] + t[i - 1][j];
                    }
                }
            for (int i = 0; i < n + 1; i++) {
                for (int j = 0; j < n + 1; j++)
                    if (i + j < n+1)
                        System.out.print(t[i][j] + "\t");
                System.out.println();
            }
        }
        else System.out.println("There're no positive numbers in the array!!!");
    }
}