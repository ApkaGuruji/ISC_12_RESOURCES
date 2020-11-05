/*
This Program was downloaded from this repository:
https://github.com/ApkaGuruji/ISC_12_RESOURCES
=========== Apka Guruji ==============
for more free coding resources for ICSE, ISC, CBSE Students
Visit us:
Website: ApkaGuruji.com
Youtube: https://www.youtube.com/ApkaGuruji
GitHub: https://github.com/ApkaGuruji
*/

import java.util.Scanner;

class PrimeTriplet
{
    int startLimit, lastLimit;
    PrimeTriplet(int startLimit, int lastLimit)
    {
        this.startLimit = startLimit;
        this.lastLimit = lastLimit;
    }
    public boolean isValid()
    {
        if(startLimit>0 && lastLimit>0)
            return true;
        else
            return false;
    }
    private boolean isPrime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public void printAll()
    {
        int count=0;
        System.out.println("Prime Triplets");
        for(int n=startLimit;n<=lastLimit;n++)
        {
            if(isPrime(n))
            {
                if(isPrime(n+6))
                {
                    if(isPrime(n+2))
                    {
                        count++;
                        System.out.println(n +  "\t" +  (n+2) + "\t" + (n+6));
                    }
                    else if(isPrime(n+4))
                    {
                        count++;
                        System.out.println(n +  "\t" +  (n+4) + "\t" + (n+6));
                    }
                }
            }
        }
        System.out.println("Total prime triplet combinations are "+ count );
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the startLimit and last limit: ");
        int startLimit = sc.nextInt();
        int lastLimit = sc.nextInt();
        PrimeTriplet ob = new PrimeTriplet(startLimit, lastLimit);
        if(!ob.isValid())
            System.out.println("Invalid Input");
        else
            ob.printAll();
    }
}