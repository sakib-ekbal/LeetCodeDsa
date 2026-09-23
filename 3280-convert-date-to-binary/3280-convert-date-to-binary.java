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
    public String convertDateToBinary(String date) {
        StringBuilder year = new StringBuilder();
        StringBuilder month = new StringBuilder();
        StringBuilder day = new StringBuilder();
        int i = 0;
        while(date.charAt(i)!='-'){
            year.append(date.charAt(i));
            i++;
        }
        i++;
        while(date.charAt(i)!='-'){
            month.append(date.charAt(i));
            i++;
        }
        i++;
        while(i<date.length()){
            day.append(date.charAt(i));
            i++;
        }
        int y=Integer.parseInt(year.toString());
        int m=Integer.parseInt(month.toString());
        int d=Integer.parseInt(day.toString());
        String by = toBinary(y);
        String bm = toBinary(m);
        String bd = toBinary(d);
        StringBuilder result = new StringBuilder();
        result.append(by);
        result.append('-');
        result.append(bm);
        result.append('-');
        result.append(bd);
        return result.toString();
    }
}