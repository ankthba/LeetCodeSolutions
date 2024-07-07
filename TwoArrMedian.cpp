#include <vector>
#include <algorithm>

class Solution {
public:
    double findMedianSortedArrays(std::vector<int>& nums1, std::vector<int>& nums2) {
        int len1 = nums1.size();
        int len2 = nums2.size();
        int medInt = (len1 + len2 + 1) / 2;

        std::vector<int> fullArr(len1 + len2);

        std::copy(nums1.begin(), nums1.end(), fullArr.begin());
        std::copy(nums2.begin(), nums2.end(), fullArr.begin() + len1);

        std::sort(fullArr.begin(), fullArr.end());

        double mid;
        if ((len1 + len2) % 2 == 1) {
            mid = fullArr[medInt - 1];
        } else {
            mid = (fullArr[medInt - 1] + fullArr[medInt]) / 2.0;
        }

        return mid;
    }
};
