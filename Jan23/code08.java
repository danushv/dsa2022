class Solution {
    public int[] getConcatenation(int[] nums) {
        Scanner input= new Scanner (System.in);
        int arrlength= nums.length;
        int finala=2*arrlength;
        int []a = new int[finala];
        for(int i=0;i<arrlength;i++)
        {
            a[i]=nums[i];
            a[i+arrlength]=nums[i];
        }
       
        
        

        return a;
    }
}
