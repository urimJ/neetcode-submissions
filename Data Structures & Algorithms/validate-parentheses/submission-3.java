class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '[' || c == '{' || c == '('){
                stack.push(c);
            }
            else{ // 분기 주의
                if(stack.isEmpty()) return false;
                else {
                    if(c==']'){
                        if(stack.peek()!='[') return false;
                    }
                    if(c=='}'){
                        if(stack.peek()!='{') return false;
                    }
                    if(c==')'){
                        if(stack.peek()!='(') return false;
                    }
                    stack.pop();
                }
            }
        }
        return stack.isEmpty(); // 스택이 비어 있어야 함
    }
}
