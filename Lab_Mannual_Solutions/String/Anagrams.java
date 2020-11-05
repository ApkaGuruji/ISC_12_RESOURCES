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

class Anagram
{
    String w;
    int count;
    Anagram(String w)
    {
        this.w = w;
        count = 0;
    }
    void print()
    {
        System.out.println("Anagrams of the word " + w + " are: ");
        anagram(w.getBytes(),0,w.length()-1);
        System.out.println("Total Number Of Anagrams: " + count);
    }
    void swap(byte arr[], int i, int j)
    {
        byte t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    void anagram(byte arr[], int l, int r)  
    {  
        if (l == r)  
        {
            count++;
            System.out.println(new String(arr));  
        }
        else
        {  
            for (int i = l; i <= r; i++)  
            {  
                swap(arr,l,i);
                anagram(arr, l+1, r);  
                swap(arr,l,i);  
            }  
        }  
    }  
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String w = sc.next();
        Anagram ob = new Anagram(w);
        ob.print();
    }
}