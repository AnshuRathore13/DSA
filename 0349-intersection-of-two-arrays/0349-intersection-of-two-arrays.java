class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> st=new HashSet<>();

        for(int num:nums1){
            st.add(num);
        }

        ArrayList<Integer> ar=new ArrayList<>();
        for(int num:nums2){
            if(st.contains(num)){
                ar.add(num);
                st.remove(num);
            }
        }

        int arr[]=new int[ar.size()];

        for(int i=0;i<arr.length;i++){
            arr[i]=ar.get(i);
        }

        return arr;
    }
}