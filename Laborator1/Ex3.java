package Laborator1;



public class Ex3 {
    public static void TwinPrimes(int lungime)
    {
        for(int i=2;i<lungime;i++)
        {
            if(prim(i)&&prim(i+2))
            {
                System.out.println("( "+i+" , "+(i+2)+" )");
            }
        }
    }

    public static boolean prim(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        TwinPrimes(100);
    }
    
}
