class Solution {
    public int countCommas(int n) {
        int commaCount = 0;
        if(n<1000) return 0;
        else commaCount = (n-1000)+1;
        return commaCount;        
    }
}