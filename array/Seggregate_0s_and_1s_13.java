Given an array of length N consisting of only 0s and 1s in random order. 
  Modify the array to segregate 0s on left side and 1s on the right side of the array.

class Solution{   
public:
    void segregate0and1(int arr[], int n) {
        // code here
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
        }
        for(int i=0;i<count;i++)
        {
            arr[i]=0;
            
        }
        for(int i=count;i<n;i++)
        {
            arr[i]=1;
        }
    }
};
