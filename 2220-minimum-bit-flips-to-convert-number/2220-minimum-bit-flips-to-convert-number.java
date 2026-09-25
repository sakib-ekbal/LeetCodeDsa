class Solution {
    public int minBitFlips(int start, int goal) {
        int count=0;
        int ans=start^goal;
        for(int i=0;i<=31;i++){
            count+=(ans&1);
            ans>>=1;
        }
        return count;
    }
}