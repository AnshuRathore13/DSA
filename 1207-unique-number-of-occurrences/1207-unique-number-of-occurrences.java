class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }

        HashSet<Integer> st=new HashSet<>();
        for(int num:mp.values()){
            if(st.contains(num)) return false;
            st.add(num);
        }

        return true;
    }
}