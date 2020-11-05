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

class StartEndVowel
{
    String s;
    StartEndVowel(String s)
    {
        this.s = s;
    }
    boolean isValid()
    {
        char ch = s.charAt(s.length()-1);
        if(ch=='.'||ch=='?'||ch=='!')
            return true;
        return false;
    }
    boolean isVowel(char ch)
    {
        String vowels="AEIOU";
        for(int i=0;i<vowels.length();i++)
            if(ch == vowels.charAt(i))
                return true;
        return false;
    }
    void process()
    {
        int count=0;
        String vs = "", cs = "";
        char terminator = s.charAt(s.length()-1);
        s = s.substring(0,s.length()-1);
        Scanner sc = new Scanner(s);
        while(sc.hasNext())
        {
            String word = sc.next();
            if(isVowel(word.charAt(0)) && isVowel(word.charAt(word.length()-1)))
            {
                vs += word + " ";
                count++;
            }
            else
            {
                cs += word + " ";
            }
        }
        System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH VOWEL = "+ count);
        System.out.println(vs + cs.substring(0,cs.length()-1) + terminator);
            
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s = sc.nextLine();
        StartEndVowel ob = new StartEndVowel(s);
        if(!ob.isValid())
            System.out.println("INVALID INPUT");
        else
            ob.process();
    }
}