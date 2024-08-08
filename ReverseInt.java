class ReverseInt {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            result = result*10 + digit;
        }
        return result;

        // if (x >= 0) {
        //     return negSol(x);
        // } else {
        //     return (-(negSol(-x)));
        // }

        
        
    }

    // public int negSol(int x) {
    //     int result = 0;
    //     for (int i = x; i > 0; i/=10) {
    //         int digit = x % 10;
    //          if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
    //             return 0;
    //         }
    //         if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {
    //             return 0;
    //         }
    //         result = result*10 + digit;
    //         x /= 10;   
    //     }
    //     return result;
    // }

}
