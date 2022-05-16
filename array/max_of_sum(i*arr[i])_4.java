class Compute {
    
    public void rotate(int arr[], int n)
    {
         int max_sum=0;
    for(int j=0;j<n;j++)
    {
        int last = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum+=i*arr[i];
