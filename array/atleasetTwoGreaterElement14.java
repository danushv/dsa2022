  {
    
    Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order.
        // Your code goes here
        int first=Integer.MIN_VALUE;;
        int second=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
            if(a[i]>first)
            {
                second=first;
                first=a[i];
            }
            else if(a[i]>second)
            {
                second=a[i];
            }
        }
        long [] result=new long[n];
        for(int i=0;i<n;i++)
        {
            if(a[i]<second)
            {
                result[i]=a[i];
            }
        }
        return result;
    }
