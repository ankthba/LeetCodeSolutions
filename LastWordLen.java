class LastWordLen {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = 0;
        int i = s.length()-1;

        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }


        // if (s.length()>1) {
        // for (int i = s.length() -1; i >- 0; i--) {
        //     if (s.charAt(i) == ' ') {
        //         break;
        //     }
        //     len++;
        // }
        // } else {
        //     return 1;
        // }
        return len;
    }
}
