class Solution {
    public boolean isValidSudoku(char[][] board) {
      HashSet<String> set=new HashSet<>();
      for(int i=0;i<board.length;i++){
          for(int j=0;j<board[0].length;j++){
              char temp=board[i][j];
              if(temp=='.') continue;
              if(!set.add(temp+"row"+i)||!set.add(temp+"col"+j)||!set.add(temp+"box"+i/3+j/3)){
                  return false;
              }
          }
      }
        return true;
    }
}
 
