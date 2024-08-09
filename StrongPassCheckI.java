// 41/53 test cases passed

class StrongPassCheckI {
    public int strongPasswordChecker(String password) {
        int passLen = password.length();
        int missedType = 3;
        int stepCounter = 0;
        // int repCounter = 1;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        if (hasLower) {
            missedType--;
        }
        if (hasUpper) {
            missedType--;
        }
        if (hasDigit) {
            missedType--;
        }

        int[] repArr = new int[3];
        int index = 0;
        int i = 0;
        // while (i < passLen) {
        //     int len = 1;
        //     while (i + len < passLen && password.charAt(i+len) == password.charAt(i)) {
        //         len++;
        //     }
        //     if (len >= 3) {
        //         repArr[index++] = len/3;
        //     }
        //     i+=len;
        // }

        while (i < passLen) {
            int len = 1;
            while (i + len < passLen && password.charAt(i + len) == password.charAt(i)) {
                len++;
            }
            if (len >= 3) {
                repArr[len % 3]++;
            }
            i += len;
        }

        // for (int i = 0; i < passLen -2; i++){
        //     if (password.charAt(i) == password.charAt(i+1) && password.charAt(i) == password.charAt(i+2)) {
        //         int len = 2;
        //         while (i + len < passLen && password.charAt(i+len) == password.charAt(i)) {
        //             len++;
        //         }
        //         repCount += len/3;
        //         i+= len -1;
        //     }
        // }

        if (passLen < 6) {
            stepCounter += Math.max(6 - passLen, missedType);
        } else if (passLen > 20) {
            int excess = passLen - 20;
            int repCount = repArr[0] + repArr[1] + repArr[2];

            for (int k = 0; k < 3; k++) {
                if (excess > 0 && repArr[k] > 0) {
                    int remove = Math.min(excess, (k + 1) * repArr[k]);
                    excess -= remove;
                    repCount -= remove / (k + 1);
                }
            }

            stepCounter = (passLen - 20) + Math.max(repCount, missedType);
        } else {
            int repCount = 0;
            for (int j = 0; j < 3; j++) {
                repCount += repArr[j];
            }
            stepCounter = Math.max(repCount, missedType);
        }

        // for (int i = 0; i < password.length(); i++) {
        //     char c = password.charAt(i);

        //     if (!Character.isLowerCase(c) && password.length() != 1) {
        //         stepCounter++;
        //     }
        //     if (!Character.isUpperCase(c) && password.length() != 1) {
        //         stepCounter++;
        //     }
        //     if (!Character.isDigit(c) && password.length() != 1) {
        //         stepCounter++;
        //     }

        //     if (i > 0 && password.charAt(i) == password.charAt(i-1)) {
        //         repCounter++;
        //     } else {
        //         repCounter = 1;
        //     }

        //     if (repCounter >= 3) {
        //         stepCounter++;
        //     }
        // }

        return stepCounter;
    }
}
