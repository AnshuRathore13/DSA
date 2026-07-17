class Solution {
    public int trap(int[] height) {

        int water=0;
        int curr=0;
        int min=0;

        if(height.length==0||height.length==1||height.length==2){
            return 0;
        }

        int[] left=new int[height.length];
        int[] right=new int[height.length];
        left[0]=height[0];
        right[height.length-1]=height[height.length-1];

        for(int i=1;i<height.length;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }

        for(int i=height.length-1;i>0;i--){
            right[i-1]=Math.max(right[i],height[i-1]);
        }



        for(int i=1;i<height.length-1;i++){
            min=0;

            min=Math.min(left[i],right[i]);
            curr=min-height[i];

            if(curr<0){
                curr=0;
            }

            water+=curr;
        }

        return water;

    }
}