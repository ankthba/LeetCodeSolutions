class PalindromeNum {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        int rev = 0;
        final int og = x;
        
        while (x != 0) {
            int temp = x%10;
            rev = rev*10 + temp;
            x/=10;
        }

        return og==rev;
    }
}
