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

class DeleteWord
{
    String s,w;
    int p;
    DeleteWord(String s, String w , int p)
    {
        this.s = s;
        this.w = w;
        this.p = p;
    }
    boolean isValid()
    {
        char ch = s.charAt(s.length()-1);
        if(ch=='.'||ch=='?'||ch=='!')
            return true;
        return false;
    }
    void process()
    {
        int count=0;
        String result="";
        char terminator = s.charAt(s.length()-1);
        s = s.substring(0,s.length()-1);
        Scanner sc = new Scanner(s);
        int i=0;
        while(sc.hasNext())
        {
            i++;
            String word = sc.next();
            if(!(i==p && w.equals(word))) 
                result = result + word + " ";
        }
        System.out.println(result.substring(0,result.length()-1)+ terminator);
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s = sc.nextLine();
        System.out.println("Word to be deleted: ");
        String w = sc.nextLine();
        System.out.println("Enter the position in the sentence: ");
        int p = Integer.parseInt(sc.nextLine());
        DeleteWord ob = new DeleteWord(s,w,p);
        if(!ob.isValid())
            System.out.println("INVALID INPUT");
        else
            ob.process();
    }
}