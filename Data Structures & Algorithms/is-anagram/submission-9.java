class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }else{
            Map<Character, Integer> hms = new HashMap<>();
            Map<Character, Integer> hmt = new HashMap<>();
            for (char c : s.toCharArray()) {
                if(!hms.containsKey(c)){
                    hms.put(c, 1);
                } else {
                    int count = hms.get(c);
                    hms.put(c, ++count);
                }
            }
            for (char c : t.toCharArray()) {
                if(!hmt.containsKey(c)){
                    hmt.put(c, 1);
                } else {
                    int count = hmt.get(c);
                    hmt.put(c, ++count);
                }
            }
            if(hms.equals(hmt)){
                return true;
            }else{
                return false;
            }
        }
    }
}
