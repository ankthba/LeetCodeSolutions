class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int maxLen = 0;
        int start = 0;

        for (int e = 0; e < s.length(); e++) {
            char c = s.charAt(e);
            start = Math.max(start, arr[c]);
            maxLen = Math.max(maxLen, e - start + 1);
            arr[c] = e + 1;
        }

        return maxLen;

    }
}
