class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evenSum = n*(n+1);;
        int oddSum = n*n;
        while(oddSum!=0){
            int rem = evenSum % oddSum;
            evenSum = oddSum;
            oddSum = rem;
        }
        return evenSum;
    }
}