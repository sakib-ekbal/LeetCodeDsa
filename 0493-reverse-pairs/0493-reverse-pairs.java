class Solution {
    static int count;
    public void inversion(int[] a, int[] b){
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if((long)a[i]>((long)2*(long)b[j])){
                count += (a.length-i);
                j++;
            }else{
                i++;
            }
        }
    }
    public void merge(int[] a,int[] b,int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
    public void mergeSort(int[] nums){
        int n = nums.length;
        if(n == 1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0;i<a.length;i++) a[i] = nums[i];
        for(int i=0;i<b.length;i++) b[i] = nums[i+a.length];
        mergeSort(a);
        mergeSort(b);
        inversion(a,b);
        merge(a,b,nums);
        a=null;
        b=null;
    }
    public int reversePairs(int[] nums) {
        count = 0;
        mergeSort(nums);
        return count;
    }
}