Given an unsorted array arr[] of size N having both negative and positive integers.
The task is place all negative element at the end of array without changing the order of positive element and negative element.

 


public void segregateElements(int arr[], int n)
    {
        // Your code goes her
        int sec=0;
        int []temp=new int [n];
        int index=0;
        for (int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                temp[index++]=arr[i];
            }
            sec=index;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                temp[index++]=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=temp[i];
        }
