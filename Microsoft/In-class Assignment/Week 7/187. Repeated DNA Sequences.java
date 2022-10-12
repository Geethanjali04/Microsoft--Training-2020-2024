class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String >set1=new HashSet<>();
        HashSet<String>repeated=new HashSet<>();
        for(int i=0;i+9<s.length();i++)
        {  
            String ten=s.substring(i,i+10);
            if(!set1.add(ten))
            { 
                repeated.add(ten);
                
            }
        } 
        return  new ArrayList(repeated);
    }
}
