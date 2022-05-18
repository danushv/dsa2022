//Rearrange array such that even positioned are greater than odd
//For Input: 
5
1 2 3 4 5

Your Output: 
1
5
2
4
3


Arrays.sort(a);
        int ans[] =new int[n];
        int start=0;
        int end = n-1;
        for(int i=0;i<n;i++)
        {
            if((i+1)%2==0)
            
                ans[i]=a[end--];
            
            else
        
                ans[i]=a[start++];
            
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(ans[i]);
            
        }
