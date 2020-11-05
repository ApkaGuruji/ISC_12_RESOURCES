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
import java.util.*;
class NumberToWords
{
    int n;
    NumberToWords(int n)
    {
        this.n = n;
    }
    boolean isValid()
    {
        if(n>0 && n<1000)
            return true;
        return false;                    
    }
    void convert()
    {
        String names1[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        String names2[]={"TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
        String names3[]={"TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"};
       
        int nd = (n+"").length();
        int arr[]=new int[nd]; 
        int div,i=0;
        for(div = n;div>0;div=div/10)
            arr[i++]= div%10;

        int d;
        for(i= nd-1;i>=0;i--)
        {
            d = arr[i];

            if(i==0)
            {
                if(d>=0&&d<=9)
                    System.out.print (names1[d]+ " ");
            }
            else if(i==1)
            {
                if(d==1)
                {
                    d=arr[--i];
                    System.out.print(names2[d]+ " ");
                }
                else
                {
                    System.out.print(names3[d-2]+ " ");
                    while(i>0&&arr[i-1]==0)
                        i--;
                }
            }
            else if(i==2)
            {
                System.out.print(names1[d]+ " HUNDRED ");
                while(i>0&&arr[i-1]==0)
                        i--;
                if(i>0)
                        System.out.print("AND ");
            }

        }

    }
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        NumberToWords ob = new NumberToWords(n);
        if(!ob.isValid())
            System.out.println("OUT OF RANGE");
        else
            ob.convert();

    }
}