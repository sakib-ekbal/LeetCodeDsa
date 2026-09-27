class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=')'){
                stack.push(s.charAt(i));
            }
            else{
                StringBuilder temp = new StringBuilder();
                while(stack.peek()!='('){
                    temp.append(stack.pop());
                }
                stack.pop();
                for(int j=0;j<temp.length();j++){
                    stack.push(temp.charAt(j));
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}