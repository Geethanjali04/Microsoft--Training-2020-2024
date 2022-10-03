class Solution {
    public int numTrees(int n) {
        return catalon(n);
    } 
    public int catalon(int n)
    {
        long c=binomialcoefficient(2*n,n); 
        return (int)(c/(long)(n+1));
    } 
    public long binomialcoefficient(int n,int k)
    {
        long res=1; 
        if(k>n-k)
        {
            k=n-k;
        } 
        for(int i=0;i<k;i++)
        {
         res*=(n-i);
         res/=(i+1); 
        } 
        return res;
    }
}
