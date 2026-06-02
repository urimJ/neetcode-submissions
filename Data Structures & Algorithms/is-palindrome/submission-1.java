class Solution {
    public boolean isPalindrome(String s) {
        LinkedList<Character> ll = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if( Character.isLetterOrDigit(c)){
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
