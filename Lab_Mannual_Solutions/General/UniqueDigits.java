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

class UniqueDigitInteger
{
    int m,n;

    public UniqueDigitInteger(int m, int n) {
        this.m = m;
        this.n = n;
    }
    void printAll()
    {
        int freq = 0;
        outerloop: for(int x=m;x<=n;x++)
        {
            for(int div1=x;div1>0;div1=div1/10)
            {
                int digit1 = div1%10;
                int c=0;
                for(int div2=x;div2>0;div2/=10)
                {
                    int digit2 = div2%10;
                    if(digit1 == digit2)
                        c++;
                }
                if(c>1)
                    continue outerloop;
            }
            freq++;
            System.out.print(freq>1?"," + x:x);
        }
        System.out.println("\nFrequency of unique-digit integers is: " + freq);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for m and n: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        UniqueDigitInteger ob = new UniqueDigitInteger(m,n);
        ob.printAll();
    }
}