class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int revnum = 0;

        while (x > 0) {
            int remainder = x % 10;
            revnum = revnum * 10 + remainder;
            x = x / 10;   // integer division
        }

        if (revnum == temp) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int num = 121;
        System.out.println(obj.isPalindrome(num)); // true

        int num2 = 123;
        System.out.println(obj.isPalindrome(num2)); // false
    }
}