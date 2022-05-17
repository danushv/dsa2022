class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
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
}

// dont use two pointer because the nonzeros order has to be preserved
