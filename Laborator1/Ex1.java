package Laborator1;
import java.util.Scanner;

public class Ex1
{
public static void main(String[] args)
{
    System.out.println("Scrieti un numar: ");
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    sc.close();
    
    if(n>=0)
    {
        System.out.println("Numarul " +n+ " este pozitiv.");
    }
    else
    {
        System.out.println("Numarul "+n+ " este negati.");
    }
}
}