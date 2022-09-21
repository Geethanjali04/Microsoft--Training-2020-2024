class Solution {
    public boolean isPalindrome(String s) {
         if (s.trim().isEmpty()) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            int leftChar = (int) s.charAt(left);
            int rightChar = (int) s.charAt(right);
            if (leftChar >= 65 && leftChar <= 90) {
                leftChar = leftChar + 32;
            } else if (!(leftChar >= 48 && leftChar <= 57) && (leftChar < 97 || leftChar > 122)) {
                left++;
                continue;
            }
            if (rightChar >= 65 && rightChar <= 90) {
                rightChar = rightChar + 32;
            } else if (!(rightChar >= 48 && rightChar <= 57) && (rightChar < 97 || rightChar > 122)) {
                right--;
                continue;
            }
            if (leftChar != rightChar) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
