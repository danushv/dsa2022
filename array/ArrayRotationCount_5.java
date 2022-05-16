      
// Find the Rotation Count in Rotated Sorted array
// Difficulty Level : Easy

      
      int min_value=arr[0];
        int min_index=0;
        for(int i=0;i<n;i++)
        {
            if(min_value>arr[i])
            {
                min_value=arr[i];
                min_index=i;
            }
        }
        return min_index;
