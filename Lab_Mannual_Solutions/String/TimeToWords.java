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

class TimeToWords
{
    int hour, minute;
    TimeToWords(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }
    boolean isValid()
    {
        if(hour>=1 && hour<=12 && minute>=0 && minute<=59)
            return true;
        return false;
    }
    String getName(int n)
    {
        String names[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten",
        "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
        if(n<=20)
            return names[n];
        else
            return names[20] + " " + names[n%10];
    }
    String titleCase(String s)
    {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
    void convert()
    {
        String result;
        if(minute == 0)
            result = getName(hour) + " o' clock";
        else
        {
            String toOrPast;
            if(minute<=(60-minute))
                toOrPast = "past ";
            else
            {
                minute = 60-minute;
                hour++;
                toOrPast = "to ";
            }
            if(minute == 15)
                result = "quarter "+toOrPast + getName(hour);
            else if(minute == 30)
                result = "half "+toOrPast + getName(hour);
            else if(minute == 1)
                result = "one minute " + toOrPast + getName(hour);
            else
                result = getName(minute)+" minutes " + toOrPast + getName(hour);
        }
        System.out.println(titleCase(result));
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hour: ");
        int hour = sc.nextInt();
        System.out.println("Enter the minute: ");
        int minute = sc.nextInt();
        TimeToWords ob = new TimeToWords(hour,minute);
        if(!ob.isValid())
            System.out.println("Incorrect Input");
        else
            ob.convert();
    }
}