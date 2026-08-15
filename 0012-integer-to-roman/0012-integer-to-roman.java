class Solution {
    public String intToRoman(int num) {
        String rom[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int dec[]= {1,4,5,9,10,40,50,90,100,400,500,900,1000};

        int i=rom.length-1;
        StringBuilder sb=new StringBuilder();

        while(num>0){
            int ls=num/dec[i];
            while (ls>0){
                sb.append(rom[i]);
                ls--;
            }
            num%=dec[i];
            i--;
        }

        return sb.toString();
    }
}