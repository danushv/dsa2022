//How do you find the missing number in a given integer array of 1 to 100?
class Solution {
    int MissingNumber(int array[], int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        int sumofarray=0;
        for(int i=0;i<array.length;i++)
        {
            sumofarray=sumofarray+array[i];
        }
        
        return sum-sumofarray;
