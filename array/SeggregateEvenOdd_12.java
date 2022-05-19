Given an array of integers, segregate even and odd numbers in the array. All the even numbers should be present first, and then the odd numbers.

/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;  
import java.util.Arrays;

class GFG {
	public static void main (String[] args) {
	    Scanner Input=new Scanner(System.in);
	    int n= Input.nextInt();
	    int index=0;
	    int sec=index;
	    int [] arr=new int [n];
	    int [] temp =new int[n];
	    for(int i=0;i<n;i++)
	    {
	    arr[i]=Input.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]%2==0)
	        {
	        temp[index++]=arr[i];
	        }
	    }
	   
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]%2!=0)
	        {
	        temp[index++]=arr[i];
	        }
	    }
	    for(int i=0;i<n;i++)
	    {
	    System.out.println(temp[i]);
	    }
	}
}
