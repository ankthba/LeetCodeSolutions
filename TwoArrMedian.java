class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int medInt = (len1 + len2 + 1)/2;

        int[] fullArr = new int[len1+len2];

        for (int i = 0; i < nums1.length; i++) {
            fullArr[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            fullArr[nums1.length + i] = nums2[i];
        }

        for (int a = 1; a < fullArr.length; a++) {
            int temp = fullArr[a];
            int i = a;
            while (i > 0 && temp < fullArr[i-1]) {
                fullArr[i] = fullArr[i-1];
                i--;
            }
            fullArr[i] = temp;
        }

        double mid;
        if (fullArr.length%2==1){
            mid = fullArr[medInt-1];
        } else {
            mid = (fullArr[medInt-1] + fullArr[medInt])/2.0;
        }

        return mid;
    
    }
}
