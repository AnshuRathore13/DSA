class Solution {
    public boolean isAnagram(String s, String t) {
        // char [] arr1=s.toCharArray();
        // char [] arr2=t.toCharArray();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        

        // return Arrays.equals(arr1,arr2);
        if(s.length()!=t.length()) return false;

        HashMap<Character,Integer> mp=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                int x=mp.get(s.charAt(i));
                mp.put(s.charAt(i),x+1);
            }else{
                mp.put(s.charAt(i),1);
            }
        }

        for(int i=0;i<s.length();i++){
            if(mp.containsKey(t.charAt(i))){
                int x=mp.get(t.charAt(i));
                if(x==0) return false;
                mp.put(t.charAt(i),x-1);
            }else return false;
        }

        return true;

    }
}