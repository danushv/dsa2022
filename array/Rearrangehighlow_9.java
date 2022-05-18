
Given an array arr of n integers, task is to print the array in the order
– smallest number, largest number, 2nd smallest number, 2nd largest number, 3rd smallest number, 3rd largest number and so on.


 void rearrangeArray(int[] arr, int n) {
        // code here
        int [] res=new int[n];
        for(int i=0;i<n;i++)
        {
            res[i]=arr[i];
        }
        Arrays.sort(res);
       // int [] res=new int[n];
        int start=0;
        int end=n-1;
        
        for(int i=0;i<n;i++)
        {
            if((i+1)%2==0)
            {
                arr[i]=res[end--];
            }
            else
            {
                arr[i]=res[start++];
            }
        }
      
