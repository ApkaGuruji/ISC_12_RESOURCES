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

class DigitSum
{
    int m, n;
    DigitSum(int m, int n)
    {
        this.m = m;
        this.n = n;
    }
    boolean isValid()
    {
        if(m>=100 && n<=10000 && n<100)
            return true;
        return false;
    }
    void find()
    {
        int x = m;
        while(true)
        {
            x++;
            int s=0;
            for(int div=x;div>0;div/=10)
            {
                int digit = div%10;
                s+=digit;
            }
            if(s == n)
            {
                System.out.println("The required number = "+ x);
                System.out.println("The total number of digits = " + (x+"").length());
                break;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for M and N: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        DigitSum ob = new DigitSum(m,n);
        if(!ob.isValid())
            System.out.println("INVALID INPUT");
        else
            ob.find();
        
    }
}