class Solution {
    public int firstUniqChar(String s) {
        Queue<Integer> q=new LinkedList<>();

        int arr[]=new int[26];

        for(int i=0;i<s.length() ;i++){
            arr[s.charAt(i)-'a']++;
            q.add(i);
        }

        while(!q.isEmpty() && arr[s.charAt(q.peek())-'a']>1){
            q.poll();
        }
        

        if(!q.isEmpty()){return q.peek();}
        return -1;
    }
}