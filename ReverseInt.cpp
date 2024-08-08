class ReverseInt {
public:
    int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (result > std::numeric_limits<int>::max() / 10 || 
                (result == std::numeric_limits<int>::max() / 10 && digit > 7)) {
                return 0;
            }
            if (result < std::numeric_limits<int>::min() / 10 || 
                (result == std::numeric_limits<int>::min() / 10 && digit < -8)) {
                return 0;
            }
            result = result*10 + digit;
        }
        return result;
    }
};
