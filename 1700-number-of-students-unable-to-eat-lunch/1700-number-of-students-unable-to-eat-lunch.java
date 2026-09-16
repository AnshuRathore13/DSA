class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int w0=0;
        int w1=0;

        for(int i=0;i<students.length;i++){
            if(students[i]==0){w0++;}
            else{w1++;}
        }

        for(int i=0;i<sandwiches.length;i++){
            if(sandwiches[i]==0){
                if(w0>0){w0--;}
                else{return w1;}
            }else{
                if(w1>0){w1--;}
                else{return w0;}
            }
        }

        return 0;
    }
}