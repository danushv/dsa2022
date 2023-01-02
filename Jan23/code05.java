// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
        int a =sc.nextInt();
        while(a>0)
        {
           
           int last=a%10;
           
            sum=sum+last;
           a=a/10;
           
        }
        System.out.println(sum);
        sum=sum*0;
        }
        
    }
}

