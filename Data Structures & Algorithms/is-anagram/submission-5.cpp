class Solution {
public:
    bool isAnagram(string s, string t) {
        int alpS[26]{0};
        int alpT[26]{0};

        if(s.size()!=t.size())
        {
            return false;
        }
        else
        {
            for(int i=0; i<s.size(); i++)
            {
                alpS[s[i]-'a']++;
                alpT[t[i]-'a']++;
            }
            for(int i=0; i<26; i++)
            {
                if(alpS[i]!=alpT[i]) return false;
                else continue;
            }
            return true;
        }
    }
};
