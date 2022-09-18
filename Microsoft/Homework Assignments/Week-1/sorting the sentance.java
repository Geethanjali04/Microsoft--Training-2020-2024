class Solution {
    public String sortSentence(String s) {
                
        String[] str = s.split(" ");
        String[] newstr = new String[str.length];
        for(String s1:str){
            String st1 = s1.substring(0,s1.length()-1);
            Integer n = Integer.parseInt(s1.substring(s1.length()-1));
            newstr[n-1]=st1;
        }
        return String.join(" ", newstr);

    }
}
