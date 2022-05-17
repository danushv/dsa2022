// o(n2) solution its kinda difficult try to run the loop in notebook and then undersand

public static int[] Rearrange (int arr[], int n) {
        // Complete the function
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[j]==i)
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    break;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=i)
            {
                arr[i]=-1;
            }
        }
        return arr;
    }
    
