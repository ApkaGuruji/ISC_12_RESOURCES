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

class DateValidity
{
    int dd, mm, yyyy;
    DateValidity(int dd, int mm, int yyyy)
    {
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }
    boolean isLeapYear(int year)
    {
        if(year%100==0)
        {
            if(year%400 == 0)
                return true;
        }
        else if(year%4 == 0)
            return true;
        return false;
    }
    boolean isValid()
    {
        if(yyyy<0)
            return false;
        if(mm <1 || mm>12)
            return false;
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeapYear(yyyy))
            days[1]=29;
        if(dd>days[mm-1])
            return false;
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date of birth in dd mm yyyy format");
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yyyy = sc.nextInt();
        DateValidity ob = new DateValidity(dd,mm,yyyy);
        if(!ob.isValid())
            System.out.println("INVALID DATE");
        else
            System.out.println("VALID DATE\n"+dd);
        
    }
}