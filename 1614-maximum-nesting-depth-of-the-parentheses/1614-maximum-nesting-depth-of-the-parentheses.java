class Solution {
    public int maxDepth(String s) {
        int Counter = 0;
        int maxCounter = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                Counter++;
                maxCounter = Math.max(maxCounter,Counter);
            }else if(s.charAt(i)==')'){
                Counter--;
            }
        }
        return maxCounter;
    }
}