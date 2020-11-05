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
import java.util.StringTokenizer;

class ShiftingEncryption
{
    String text;
    int shift;
    ShiftingEncryption(String text, int shift)
    {
        this.text = text;
        this.shift = shift;
    }
    boolean isValid()
    {
        if(shift >= 1 && shift <=26)
            return true;
        else
            return false;
    }
    char unshift(char ch)
    {
        ch += (shift-1);
        if(ch > 90)
            ch -= 26;
        return ch;
    }
    void process()
    {
        String message = text.replace(" ", "");
        int l=message.length();
        String pass1="";
        for(int i=0;i<l;i++)
        {
            pass1 += unshift(message.charAt(i));
        }
        String pass2 = pass1.replace("QQ"," ");
        System.out.println("DECODED TEXT: " + pass2);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coded text: ");
        String text = sc.nextLine();
        System.out.println("Enter the shift value: ");
        int shift = Integer.parseInt(sc.nextLine());
        ShiftingEncryption ob = new ShiftingEncryption(text,shift);
        if(!ob.isValid())
            System.out.println("INVALID SHIFT VALUE");
        else
            ob.process();
    }
}