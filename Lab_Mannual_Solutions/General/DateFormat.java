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
class AddDaysToDate
{
    int dd, mm, yyyy;
    int nd;

    public AddDaysToDate(int dd, int mm, int yyyy, int nd) {
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
        this.nd = nd;
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
    void add()
    {
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int daysLeft = nd;
        while(daysLeft > 0)
        {
            if(isLeapYear(yyyy))
                days[1]=29;
            while(mm < 13 && (daysLeft-(days[mm-1]-dd))>0)
            {
                daysLeft-=(days[mm-1]-dd);
                dd=0;
                mm++;
            }
            if(mm==13)
            {
                mm=1;
                yyyy++;
            }
            else
               break;
        }
        dd=daysLeft;
        
    }
    void display()
    {
        System.out.println("Project Submission Date: ");
        System.out.println(dd + "/" + mm + "/" + yyyy);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Project Allotment Date: ");
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yyyy = sc.nextInt();
        System.out.println("Enter the no of days to add: ");
        int nd = sc.nextInt();
        AddDaysToDate ob = new AddDaysToDate(dd,mm,yyyy,nd);
        ob.add();
        ob.display();
    }
}