class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }else{
            int[] arrS = new int[26];
            int[] arrT = new int[26];

            for (char c : s.toCharArray()) {
                arrS[c-'a']++;
            }
            for (char c : t.toCharArray()) {
                arrT[c-'a']++;
            }
            return Arrays.equals(arrS, arrT);
        }
    }
}
