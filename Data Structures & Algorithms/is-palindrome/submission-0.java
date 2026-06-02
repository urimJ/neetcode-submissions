class Solution {
    public boolean isPalindrome(String s) {
        LinkedList<Character> ll = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if( 'A'<= c && c <='z' || '0' <= c && c <= '9'){
                ll.add(Character.toLowerCase(c));
            }
        }

        int count = ll.size()/2;
        for(int i=0; i<count; i++){
            if(ll.pollFirst() != ll.pollLast()){
                return false;
            }
        }
        return true;
    }
}
