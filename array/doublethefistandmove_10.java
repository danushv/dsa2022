For a given array of n integers and assume that ‘0’ is an invalid number and all others as a valid number. Convert the array in such a way that 
if both current and next element is valid and both have same value then double current value
and replace the next number with 0. After the modification, rearrange the array such that all 0’s shifted to the end. 

class Solution{
    void modifyAndRearrangeArr (int arr[], int n) {
        // Complete the function
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=0 &&arr[i]==arr[i+1])
            {
                arr[i]=2*arr[i];
                arr[i+1]=0;
                i++;
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        
        {
           if(arr[i]!=0)
           {
               arr[count++]=arr[i];
           }
        }
        while(count<n)
        {
            arr[count++]=0;
        }
    }
