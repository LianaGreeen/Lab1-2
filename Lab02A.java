import java.util.Scanner;
import java.util.Date;

public class Lab02A {
    public static void main (String[] arg) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = in.nextInt();
        System.out.print("Input system: ");
        int system = in.nextInt();
        int size = 50;
        int n = 0; int k = number;
        int[] r = new int[size];
        for(int i = 0; i < size ; i++) {
            n = k/system;
            r[i] = k % system;
            if(n < system) { k = i; break; }
            k = n;
        }
        if (system < 10) {
            if (n != 0)
                System.out.print(n);
            for(int i = k; i >= 0; i--)
                System.out.print(r[i]);
        }
        else {
            if (n > 9){
                n = 65 + (n - 10);
                char letter = 65;
                while(letter != n)
                    letter++;
                System.out.print(letter);
            }
            else {
                if(n != 0)
                    System.out.print(n);
            }
            for(int i = k; i >= 0; i--)
                if(r[i] > 9) {
                    n = 65 + (r[i] - 10);
                    char letter = 65;
                    while(letter != n)
                        letter++;
                    System.out.print(letter);
                }
                else System.out.print(r[i]);
        }
        Date date = new Date();
        System.out.println();
        System.out.println("Liana Stavrova");
        System.out.println("Date of receipt: Mon Feb 8 15:00:00 MSK 2021");
        System.out.println("Date og assignment: " + date);

    }
}