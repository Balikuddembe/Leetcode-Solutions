class IndexOfOccurrence {
    public static int strStr(String haystack, String needle) {
        int hayLength = haystack.length();
        int needlLength = needle.length();
        for(int i=0;i<=hayLength-needlLength;i++) {
            int j;
            for(j=0;j<needlLength;j++) {
                if(haystack.charAt(i+j) !=needle.charAt(j)) {
                    break;
                }
            }
            if(j==needlLength) {
                return i;
            }
        }
        return -1;
    }
}