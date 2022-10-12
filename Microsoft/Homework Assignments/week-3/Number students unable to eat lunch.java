class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int onesc=0,zerosc=0;
        for(int std:students){
            if(std==0){
                zerosc++;
            }else{
                onesc++;
            }
        }
        for(int sw:sandwiches){
            if(sw==0){
                if(zerosc==0){
                    return onesc;
                }
                zerosc--;
            }else{
                if(onesc==0){
                    return zerosc;
                }
                onesc--;
            }
        }
        return 0;
    }
}
