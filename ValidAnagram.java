class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int [] count = new int[26];

        for(int i=0;i<s.length();i++) {
            count[s.charAt(i) - 'a'] ++; // Increment frequency for character in s
            count[t.charAt(i) - 'a'] --; // Decrement frequency for character in t
        }
        for(int i=0;i<count.length;i++) {
            if(count[i]!=0) {
                return false;
            }
        }
        return true;
    }
}