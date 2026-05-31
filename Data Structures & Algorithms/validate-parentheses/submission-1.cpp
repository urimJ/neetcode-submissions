class Solution {
public:
    bool isValid(string s) {
        stack<char> st; // char 타입 스택 사용
        for (int i = 0; i < s.size(); i++) { // 입력 문자열 s 사용
            if (s[i] == '(' || s[i] == '[' || s[i] == '{') {
                st.push(s[i]);
            } else {
                if (st.empty()) return false; // 스택이 비어 있는지 확인
                if (s[i] == ')' && st.top() != '(') return false;
                if (s[i] == ']' && st.top() != '[') return false;
                if (s[i] == '}' && st.top() != '{') return false;
                st.pop();
            }
        }
        return st.empty(); // 모든 문자가 처리된 후 스택이 비어 있으면 true
    }
};
