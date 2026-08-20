class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> ar1= new ArrayList<>();
        ArrayList<Integer> ar2= new ArrayList<>();

        int i=0;
        int j=0;
        int k=2;
        ar1.add(nums[0]);
        ar2.add(nums[1]);

        while(k<nums.length){
            if(ar1.get(i)>ar2.get(j)){
                ar1.add(nums[k]);
                i++;
            }else{
                ar2.add(nums[k]);
                j++;
            }
            k++;
        }

        i=0;
        j=0;

        while(i<ar1.size()){
            nums[i]=ar1.get(i);
            i++;
        }
        while(j<ar2.size()){
            nums[ar1.size()+j]=ar2.get(j);
            j++;
        }

        return nums;

    }
}