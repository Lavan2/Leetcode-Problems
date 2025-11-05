class Solution {
public:
    void helper(vector<string>& ans, unordered_map<char, string> m,
                string digits, string curr, int idx) {
        if (idx == digits.size()) {
            ans.push_back(curr);
            return;
        }
        for (int i = 0; i < m[digits[idx]].size(); i++) {
            helper(ans, m, digits, curr + (m[digits[idx]][i]), idx + 1);
        }
    }
    vector<string> letterCombinations(string digits) {
        unordered_map<char, string> m;
        m['2'] = "abc";
        m['3'] = "def";
        m['4'] = "ghi";
        m['5'] = "jkl";
        m['6'] = "mno";
        m['7'] = "pqrs";
        m['8'] = "tuv";
        m['9'] = "wxyz";
        vector<string> ans;
        helper(ans, m, digits, {}, 0);
        return ans;
    }
};
