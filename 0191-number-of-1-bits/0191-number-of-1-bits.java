class Solution {
    public String toBinary(int n){
        StringBuilder res = new StringBuilder();
        while(n>0){
            if(n%2 == 1) res.append('1');
            else res.append('0');
            n=n/2;
        }
        res.reverse();
        return res.toString();
    }
    public int hammingWeight(int n) {
        int ones = 0;
        String  num = toBinary(n);
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='1') ones++;
        }
        return ones;
    }
}