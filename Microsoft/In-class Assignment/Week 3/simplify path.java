class Solution {
    public String simplifyPath(String path) { 
        Stack<String >s=new Stack<>();
        String[]files=path.split("/"); 
        for(int i=0;i<files.length;i++)
        {
            if(files[i].equals("..") && !s.isEmpty()) 
            {
                s.pop();
            } 
            else if(!(files[i].equals("..")) && !(files[i].equals(".")) && !(files[i].equals("")) )
            {
                s.push(files[i]);        
            }
        }   
       if(s.isEmpty())
      {
             return "/";           
      }
        String ans="";
        while(!(s.isEmpty())) 
              {
                  ans="/"+s.pop()+ans;
              }
        return ans;
    } 
}
