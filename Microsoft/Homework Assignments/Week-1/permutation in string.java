class Solution {
    public boolean checkInclusion(String s1, String s2) { 
         if(s1.length() > s2.length()) return false;
        int[] first = count(s1);
        int[] second = new int[26];
        for(int i = 0; i < s1.length(); i++){
            second[s2.charAt(i) - 'a']++;
        }
        if(equals(first, second)) return true;
        int start = 0; 
        while((start + s1.length() )< s2.length()){
            second[s2.charAt(start) - 'a']--;
            second[s2.charAt(start + s1.length()) - 'a']++;
            if(equals(first, second)) return true;
            start++;
        }
        return false;
        
    }
    private boolean equals(int[] arr1, int[] arr2){
        for(int i = 0; i < 26; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    private int[] count(String s){
        int[] arr = new int[26];
        for(char ch: s.toCharArray()){
            arr[ch - 'a']++;
        }
        return arr;
        
    }
}
