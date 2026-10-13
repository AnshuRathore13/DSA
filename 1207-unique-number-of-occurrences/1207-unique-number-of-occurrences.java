class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                int x=mp.get(arr[i]);
                mp.put(arr[i],x+1);
            }else{
                mp.put(arr[i],1);
            }
        }

        HashSet<Integer> set=new HashSet<>();
        for(int num:mp.values()){
            if(set.contains(num)) return false;
            else set.add(num);
        }

        return true;
    }
}