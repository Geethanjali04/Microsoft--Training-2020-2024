class Solution {
    public boolean isValid(String str) {
        HashMap<Character,Character>mappings=new HashMap<Character,Character>(); 
        Stack<Character>s=new Stack<Character>(); 
        mappings.put('}','{');
        mappings.put(')','(');
        mappings.put(']','[');
        
        for(int i=0;i<str.length();i++)
        { 
            char c=str.charAt(i);
          if(mappings.containsKey(c))
          {
              char topelement=s.isEmpty()?' ':s.pop(); 
              if(topelement!=mappings.get(c))
              {
                  return false;
              }
          } 
            else 
            {
                s.push(c);
            }
        } 
        return s.isEmpty();
    }
}
