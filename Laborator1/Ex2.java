package Laborator1;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Scrieti lungimea array-ului.");
        int l=sc.nextInt();
        int array[]=new int[l];

        System.out.println("Introduceti numerele din array.");
        for(int i=0;i<l;i++)
        {
            System.out.println("Numarul "+(i+1)+": ");
            array[i]=sc.nextInt();
        }
        int suma=0;
        for(int numar:array)
        {
            suma+=numar;
        }

        int medie=suma/l;
        System.out.println("Media numerelor din array este: "+medie);

        sc.close();
    }
}