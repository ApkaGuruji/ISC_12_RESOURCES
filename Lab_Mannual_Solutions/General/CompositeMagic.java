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

class CompositeMagic
{
    int m,n;

    public CompositeMagic(int m, int n) {
        this.m = m;
        this.n = n;
    }
    boolean isValid()
    {
        if(m>0 && n>0 && m<n)
            return true;
        return false;
    }
    boolean isComposite(int n)
    {
        for(int i=2;i<n;i++)
            if(n%i==0)
                return true;
        return false;
    }
    boolean isMagic(int n)
    {
        int s=n;
        while(s>9)
        {
            s=0;
            for(int div=n;div>0;div/=10)
            {
                int digit = div%10;
                s+=digit;
            }
            n=s;
        }
        if(s==1)
            return true;
        return false;
    }
    void generate()
    {
        int freq=0;
        System.out.println("The Composite Magic Integers are: ");
        for(int x=m;x<=n;x++)
        {
            if(isComposite(x) && isMagic(x))
            {
                freq++;
                System.out.print(freq>1?","+x:x);
            }
        }
        System.out.println("\nFrequency of the composite magic integers: " + freq);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for m and n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        CompositeMagic ob = new CompositeMagic(m,n);
        if(!ob.isValid())
            System.out.println("INVALID INPUT");
        else
            ob.generate();
    }
}