class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        String y;

        if (s.charAt(0) == '-') {
            s = s.substring(1);         
            y = new StringBuilder(s).reverse().toString();

            long val = Long.parseLong(y); 
            if (-2147483648L <= -val && -val <= 2147483647L) {
                return (int)(-val);
            } else {
                return 0;
            }

        } else {
            y = new StringBuilder(s).reverse().toString();

            long val = Long.parseLong(y);
            if (-2147483648L <= val && val <= 2147483647L) {
                return (int)val;
            } else {
                return 0;
            }
        }
    }
}