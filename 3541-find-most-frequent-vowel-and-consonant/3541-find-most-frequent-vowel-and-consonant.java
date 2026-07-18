class Solution {
    public int maxFreqSum(String s) {
        int n = s.length();
        int maxVowFreq = 0;
        int maxConsFreq = 0;
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i =0;
        int j = 0;
        while(i<n){
            j = i;
            while(j < n && arr[i] == arr[j]){
                j++;
            }
            int freq = j-i;
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' 
            || arr[i] == 'o' || arr[i] == 'u'){
                if(freq > maxVowFreq){
                    maxVowFreq = freq;
                }
            }else{
                if(freq > maxConsFreq){
                    maxConsFreq = freq;
                }
            }
            i = j;
        }
        return maxVowFreq+maxConsFreq;
    }
}