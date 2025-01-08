// Question Link: https://leetcode.com/problems/valid-anagram/


// class Solution {
//     public boolean isAnagram(String s, String t) {

//         if (s.length() != t.length()) {
//             return false;
//         }

//         int[] count = new int[26];

//         for (int i = 0; i < s.length(); i++) {
//             count[s.charAt(i) - 'a'] += 1;
//         }

//         for (int i = 0; i < t.length(); i++) {
//             if (count[t.charAt(i) - 'a'] == 0) {
//                 return false;
//             }
            
//             count[t.charAt(i) - 'a'] -= 1;
//         }

//         return true;        
//     }
// }










//MINE
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;

        int[] no = new int[26];
        for(int i=0;i<s.length();i++){
            no[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<t.length();i++){
            no[t.charAt(i) - 'a']--;
            if(no[t.charAt(i) - 'a']<0){
                return false;
            }
        }
        return true;
    }
}
