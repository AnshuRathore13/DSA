class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("01",0);
        map.put("02",31);
        map.put("03",59);
        map.put("04",90);
        map.put("05",120);
        map.put("06",151);
        map.put("07",181);
        map.put("08",212);
        map.put("09",243);
        map.put("10",273);
        map.put("11",304);
        map.put("12",334);

        // int day=map.get(leaveAlice.substring(0,2))+Integer.parseInt(leaveAlice.substring(3,5))-map.get(arriveBob.substring(0,2))-Integer.parseInt(arriveBob.substring(3,5));

        // if(day<=0) return 0;
        // return day+1;
        int day=0;

        int aa=map.get(arriveAlice.substring(0,2))+Integer.parseInt(arriveAlice.substring(3,5));

        int la=map.get(leaveAlice.substring(0,2))+Integer.parseInt(leaveAlice.substring(3,5));

        int ab=map.get(arriveBob.substring(0,2))+Integer.parseInt(arriveBob.substring(3,5));

        int lb=map.get(leaveBob.substring(0,2))+Integer.parseInt(leaveBob.substring(3,5));

        for(int i=aa;i<=la;i++){
            if(i>=ab && i<=lb){
                day++;
            }
        }

        return day;
    }
}