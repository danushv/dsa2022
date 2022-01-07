import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here

       int n=scn.nextInt();
       // in the below code in general all the array content willbe false......
        boolean arr[] = new boolean[n+1];

        for(int i=2;i*i<arr.length;i++){
            if(arr[i]==false)
            {
                for(int j=i;i*j<arr.length;j++)
                {
                    arr[i*j]=true;
                }
            }
        }

        for(int i=2;i<arr.length;i++)
        {
            if(arr[i]==false)
            {
                System.out.println(i);
            }
        }
  
   }
  }
