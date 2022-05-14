
class Solution {
    void leftRotate(int[] arr, int n, int d) {
        // code here
        d=d%n;
        int size=arr.length;
        ReverseArray(arr,0,d-1);
        ReverseArray(arr,d,n-1);
        ReverseArray(arr,0,n-1);
        
    }
    static void ReverseArray(int[]array,int start,int end)
    {
        while(start<end)
        {
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
            
        }
    }
}
